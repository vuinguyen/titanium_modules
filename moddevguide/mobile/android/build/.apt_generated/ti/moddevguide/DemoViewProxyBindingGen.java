/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package ti.moddevguide;

import org.appcelerator.kroll.KrollArgument;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.KrollConverter;
import org.appcelerator.kroll.KrollInvocation;
import org.appcelerator.kroll.KrollMethod;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.KrollProxyBinding;
import org.appcelerator.kroll.KrollModuleBinding;
import org.appcelerator.kroll.KrollDynamicProperty;
import org.appcelerator.kroll.KrollReflectionProperty;
import org.appcelerator.kroll.KrollInjector;
import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollDefaultValueProvider;
import org.appcelerator.kroll.util.KrollReflectionUtils;
import org.appcelerator.kroll.util.KrollBindingUtils;
import org.appcelerator.titanium.kroll.KrollBridge;
import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.util.Log;

import org.mozilla.javascript.Scriptable;

import java.util.HashMap;

import ti.moddevguide.DemoViewProxy;


/* WARNING: this code is generated for binding methods in Android */
public class DemoViewProxyBindingGen
	extends org.appcelerator.titanium.proxy.TiViewProxyBindingGen
{
	private static final String TAG = "DemoViewProxyBindingGen";

	private static final String DYNPROP_color = "color";
		
	public DemoViewProxyBindingGen() {
		super();
		// Constants are pre-bound
		
		bindings.put(DYNPROP_color, null);
		
	}

	public void bindContextSpecific(KrollBridge bridge, KrollProxy proxy) {
	}

	@Override
	public Object getBinding(String name) {
		Object value = bindings.get(name);
		if (value != null) { 
			return value;
		}





		// Dynamic Properties
		if (name.equals(DYNPROP_color)) {
			KrollDynamicProperty color_property = new KrollDynamicProperty(DYNPROP_color,
				false, true,
				false) {
				
				@Override
				public Object dynamicGet(KrollInvocation __invocation) {
					Log.w(TAG, "Property DemoView.color isn't readable");
					return KrollProxy.UNDEFINED;
				}

				@Override
				public void dynamicSet(KrollInvocation __invocation, Object __value) {
	

	Object __setColor_tmp;
		KrollArgument __color_argument = new KrollArgument("color");
		java.lang.String color;
			__color_argument.setOptional(false);
			
				__setColor_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __value, java.lang.String.class);
				try {
					color = (java.lang.String) __setColor_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.String type for argument \"color\" in \"setColor\", but got " + __setColor_tmp);
				}
		__color_argument.setValue(color);
		__invocation.addArgument(__color_argument);
	
	
	
	
	((DemoViewProxy) __invocation.getProxy()).setColor(
		color
		);
				}
			};
			color_property.setRunOnUiThread(true);
			color_property.setJavascriptConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			color_property.setNativeConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			bindings.put(DYNPROP_color, color_property);
			return color_property;
		}



		return super.getBinding(name);
	}

	private static final String SHORT_API_NAME = "DemoView";
	private static final String FULL_API_NAME = "Moddevguide.DemoView";
	private static final String ID = "ti.moddevguide.DemoViewProxy";

	public String getAPIName() {
		return FULL_API_NAME;
	}

	public String getShortAPIName() {
		return SHORT_API_NAME;
	}

	public String getId() {
		return ID;
	}

	public KrollModule newInstance(TiContext context) {
		return null;
	}

	public Class<? extends KrollProxy> getProxyClass() {
		return DemoViewProxy.class;
	}

	public boolean isModule() {
		return false; 
	}
}