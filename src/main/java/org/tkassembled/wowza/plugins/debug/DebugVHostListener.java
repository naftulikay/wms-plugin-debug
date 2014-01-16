package org.tkassembled.wowza.plugins.debug;

import com.wowza.wms.amf.AMFDataList;
import com.wowza.wms.client.IClient;
import com.wowza.wms.request.RequestFunction;
import com.wowza.wms.vhost.IVHost;
import com.wowza.wms.vhost.IVHostNotify;

public class DebugVHostListener implements IVHostNotify {

	@Override
	public void onVHostClientConnect(IVHost vhost, IClient client,
			RequestFunction functions, AMFDataList params) {
		
	}

	@Override
	public void onVHostCreate(IVHost vhost) {
		
	}

	@Override
	public void onVHostInit(IVHost vhost) {
		
	}

	@Override
	public void onVHostShutdownComplete(IVHost vhost) {
		
	}

	@Override
	public void onVHostShutdownStart(IVHost vhost) {
		
	}

}
