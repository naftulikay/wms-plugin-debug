package org.tkassembled.wowza.plugins.debug;

import com.wowza.wms.amf.AMFDataList;
import com.wowza.wms.amf.AMFPacket;
import com.wowza.wms.application.IApplicationInstance;
import com.wowza.wms.client.IClient;
import com.wowza.wms.httpstreamer.model.IHTTPStreamerSession;
import com.wowza.wms.media.model.MediaCodecInfoAudio;
import com.wowza.wms.media.model.MediaCodecInfoVideo;
import com.wowza.wms.module.IModuleOnApp;
import com.wowza.wms.module.IModuleOnCall;
import com.wowza.wms.module.IModuleOnConnect;
import com.wowza.wms.module.IModuleOnHTTPSession;
import com.wowza.wms.module.IModuleOnRTPSession;
import com.wowza.wms.module.IModuleOnStream;
import com.wowza.wms.module.ModuleBase;
import com.wowza.wms.request.RequestFunction;
import com.wowza.wms.rtp.model.RTPSession;
import com.wowza.wms.stream.IMediaStream;
import com.wowza.wms.stream.IMediaStreamActionNotify3;

public class ModuleDebug extends ModuleBase implements IModuleOnApp,
		IModuleOnConnect, IModuleOnStream, IModuleOnHTTPSession, IModuleOnCall,
		IMediaStreamActionNotify3, IModuleOnRTPSession {

	@Override
	public void onPause(IMediaStream stream, boolean isPause, double location) {

	}

	@Override
	public void onPlay(IMediaStream stream, String streamName,
			double playStart, double playLen, int playReset) {

	}

	@Override
	public void onPublish(IMediaStream stream, String streamName,
			boolean isRecord, boolean isAppend) {

	}

	@Override
	public void onSeek(IMediaStream stream, double location) {

	}

	@Override
	public void onStop(IMediaStream stream) {

	}

	@Override
	public void onUnPublish(IMediaStream stream, String streamName,
			boolean isRecord, boolean isAppend) {

	}

	@Override
	public void onRTPSessionCreate(RTPSession rtpSession) {

	}

	@Override
	public void onRTPSessionDestroy(RTPSession rtpSession) {

	}

	@Override
	public void onMetaData(IMediaStream stream, AMFPacket metaDataPacket) {

	}

	@Override
	public void onPauseRaw(IMediaStream stream, boolean isPause, double location) {

	}

	@Override
	public void onCall(String handlerName, IClient client,
			RequestFunction function, AMFDataList params) {

	}

	@Override
	public void onHTTPSessionCreate(IHTTPStreamerSession httpSession) {

	}

	@Override
	public void onHTTPSessionDestroy(IHTTPStreamerSession httpSession) {

	}

	@Override
	public void onStreamCreate(IMediaStream stream) {
		stream.addClientListener(this);
	}

	@Override
	public void onStreamDestroy(IMediaStream stream) {
		stream.removeClientListener(this);
	}

	@Override
	public void onConnect(IClient client, RequestFunction function,
			AMFDataList params) {

	}

	@Override
	public void onConnectAccept(IClient client) {

	}

	@Override
	public void onConnectReject(IClient client) {

	}

	@Override
	public void onDisconnect(IClient client) {

	}

	@Override
	public void onAppStart(IApplicationInstance appInstance) {

	}

	@Override
	public void onAppStop(IApplicationInstance appInstance) {

	}

	@Override
	public void onCodecInfoAudio(IMediaStream stream,
			MediaCodecInfoAudio codecInfoAudio) {
		
	}

	@Override
	public void onCodecInfoVideo(IMediaStream stream,
			MediaCodecInfoVideo codecInfoVideo) {
		
	}

}
