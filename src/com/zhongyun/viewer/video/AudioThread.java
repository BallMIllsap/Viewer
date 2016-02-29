package com.zhongyun.viewer.video;
import com.ichano.rvs.viewer.Media;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.util.Log;
public class AudioThread
{
	private AudioTrack mAudio;
	private byte[] mAudioBuffer;
	int audioLength = 2048;
	int resultAudioLength = 0;
	int channel_configuration;
	int connectCount;
	private Thread workingThread;
	// ////////////////new avs /////////////////////////
	private Media media;
	private long mediaStreamId;
	private long decoderId;

	boolean startPlay = false , isPlayPause = false;
	
	public AudioThread(int sampleRateInHz, int channel, long streamId, long decoderId, Media media)
	{
		if (channel == 1)
		{
			channel_configuration = AudioFormat.CHANNEL_CONFIGURATION_MONO;
		} else
		{
			channel_configuration = AudioFormat.CHANNEL_CONFIGURATION_STEREO;
		}
		this.mediaStreamId = streamId;
		this.decoderId = decoderId;
		this.media = media;
		int minBufferSize = AudioTrack.getMinBufferSize(sampleRateInHz, channel_configuration, AudioFormat.ENCODING_PCM_16BIT);
		if (minBufferSize > audioLength)
		{
			audioLength = minBufferSize;
		}
		mAudioBuffer = new byte[audioLength];
		mAudio = new AudioTrack(AudioManager.STREAM_MUSIC, sampleRateInHz, channel_configuration, AudioFormat.ENCODING_PCM_16BIT, audioLength, AudioTrack.MODE_STREAM);
	}

	public void deinitAudio()
	{
		isPlayPause = true;
		startPlay = false;
		if(null != workingThread){
			workingThread.interrupt();
			workingThread = null;
		}
		if (null != mAudio)
		{
			mAudio.stop();
			mAudio.release();
			mAudio = null;
		}
		mAudioBuffer = null;
	}

	public void pauseAudioPlayback()
	{
		mAudio.pause();
		isPlayPause = true;
	}

	public void resumeAudioPlayback()
	{
		mAudio.play();
		isPlayPause = false;
	}
	
	public void startPlayAudio(){
		if (null != mAudio)
		{
			startPlay = true;
			isPlayPause = false;
			mAudio.play();
			if(null == workingThread)
			{
				workingThread = new Thread()
				{
					public void run()
					{
						try
						{
							byte[] audiodata = new byte[8192];
							int readSize = 0;
							while (startPlay)
							{
								if(!isPlayPause)
								{
									readSize = media.getAudioDecodedData(mediaStreamId, decoderId,audiodata);
									if(readSize > 0)
									{
										mAudio.write(audiodata, 0, readSize);
									}else{
										Thread.sleep(10);
									}
								}
								
							}
						} catch (Exception e)
						{
							Log.e("AudioThread", e.toString());
						}
					}
				};
				workingThread.start();
			}
		}
	}
}
