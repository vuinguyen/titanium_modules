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

import ti.moddevguide.KrollDemoProxy;


/* WARNING: this code is generated for binding methods in Android */
public class KrollDemoProxyBindingGen
	extends ti.moddevguide.LifeCycleProxyBindingGen
{
	private static final String TAG = "KrollDemoProxyBindingGen";

	private static final String DYNPROP_watchPropertyChanges = "watchPropertyChanges";
	private static final String METHOD_registerCallbacks = "registerCallbacks";
	private static final String METHOD_callThisCallbackDirectly = "callThisCallbackDirectly";
	private static final String METHOD_signalEvent = "signalEvent";
	private static final String METHOD_requestDataWithCallback = "requestDataWithCallback";
	private static final String METHOD_signalCallbackWithSuccess = "signalCallbackWithSuccess";
		
	public KrollDemoProxyBindingGen() {
		super();
		// Constants are pre-bound
		
		bindings.put(DYNPROP_watchPropertyChanges, null);
		bindings.put(METHOD_registerCallbacks, null);
		bindings.put(METHOD_callThisCallbackDirectly, null);
		bindings.put(METHOD_signalEvent, null);
		bindings.put(METHOD_requestDataWithCallback, null);
		bindings.put(METHOD_signalCallbackWithSuccess, null);
		
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
		if (name.equals(DYNPROP_watchPropertyChanges)) {
			KrollDynamicProperty watchPropertyChanges_property = new KrollDynamicProperty(DYNPROP_watchPropertyChanges,
				false, true,
				true) {
				
				@Override
				public Object dynamicGet(KrollInvocation __invocation) {
					Log.w(TAG, "Property KrollDemo.watchPropertyChanges isn't readable");
					return KrollProxy.UNDEFINED;
				}

				@Override
				public void dynamicSet(KrollInvocation __invocation, Object __value) {
	

	Object __setWatchPropertyChanges_tmp;
		KrollArgument __enabled_argument = new KrollArgument("enabled");
		boolean enabled;
			__enabled_argument.setOptional(false);
			
				__setWatchPropertyChanges_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __value, Boolean.class);
				try {
					enabled = (Boolean) __setWatchPropertyChanges_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected Boolean type for argument \"enabled\" in \"setWatchPropertyChanges\", but got " + __setWatchPropertyChanges_tmp);
				}
		__enabled_argument.setValue(enabled);
		__invocation.addArgument(__enabled_argument);
	
	
	
	
	((KrollDemoProxy) __invocation.getProxy()).setWatchPropertyChanges(
		enabled
		);
				}
			};
			watchPropertyChanges_property.setJavascriptConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			watchPropertyChanges_property.setNativeConverter(org.appcelerator.kroll.KrollConverter.getInstance());
			bindings.put(DYNPROP_watchPropertyChanges, watchPropertyChanges_property);
			return watchPropertyChanges_property;
		}

		// Methods
		if (name.equals(METHOD_registerCallbacks)) {
			KrollMethod registerCallbacks_method = new KrollMethod(METHOD_registerCallbacks) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_registerCallbacks);

	Object __registerCallbacks_tmp;
		KrollArgument __args_argument = new KrollArgument("args");
		org.appcelerator.kroll.KrollDict args;
			__args_argument.setOptional(false);
			
				__registerCallbacks_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], org.appcelerator.kroll.KrollDict.class);
				try {
					args = (org.appcelerator.kroll.KrollDict) __registerCallbacks_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected org.appcelerator.kroll.KrollDict type for argument \"args\" in \"registerCallbacks\", but got " + __registerCallbacks_tmp);
				}
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	
	
	((KrollDemoProxy) __invocation.getProxy()).registerCallbacks(
		__invocation
		,
		args
		);
		return KrollProxy.UNDEFINED;
				}
			};
			bindings.put(METHOD_registerCallbacks, registerCallbacks_method);
			return registerCallbacks_method;
		}
		
		if (name.equals(METHOD_callThisCallbackDirectly)) {
			KrollMethod callThisCallbackDirectly_method = new KrollMethod(METHOD_callThisCallbackDirectly) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_callThisCallbackDirectly);

	Object __callThisCallbackDirectly_tmp;
		KrollArgument __args_argument = new KrollArgument("args");
		org.appcelerator.kroll.KrollDict args;
			__args_argument.setOptional(false);
			
				__callThisCallbackDirectly_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], org.appcelerator.kroll.KrollDict.class);
				try {
					args = (org.appcelerator.kroll.KrollDict) __callThisCallbackDirectly_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected org.appcelerator.kroll.KrollDict type for argument \"args\" in \"callThisCallbackDirectly\", but got " + __callThisCallbackDirectly_tmp);
				}
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	
	
	((KrollDemoProxy) __invocation.getProxy()).callThisCallbackDirectly(
		__invocation
		,
		args
		);
		return KrollProxy.UNDEFINED;
				}
			};
			bindings.put(METHOD_callThisCallbackDirectly, callThisCallbackDirectly_method);
			return callThisCallbackDirectly_method;
		}
		
		if (name.equals(METHOD_signalEvent)) {
			KrollMethod signalEvent_method = new KrollMethod(METHOD_signalEvent) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __signalEvent_tmp;
	
	
	
	
	((KrollDemoProxy) __invocation.getProxy()).signalEvent(
		__invocation
		
);
		return KrollProxy.UNDEFINED;
				}
			};
			signalEvent_method.setRunOnUiThread(true);
			bindings.put(METHOD_signalEvent, signalEvent_method);
			return signalEvent_method;
		}
		
		if (name.equals(METHOD_requestDataWithCallback)) {
			KrollMethod requestDataWithCallback_method = new KrollMethod(METHOD_requestDataWithCallback) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __requestDataWithCallback_tmp;
	
	
	
	
	((KrollDemoProxy) __invocation.getProxy()).requestDataWithCallback(
		__invocation
		
);
		return KrollProxy.UNDEFINED;
				}
			};
			bindings.put(METHOD_requestDataWithCallback, requestDataWithCallback_method);
			return requestDataWithCallback_method;
		}
		
		if (name.equals(METHOD_signalCallbackWithSuccess)) {
			KrollMethod signalCallbackWithSuccess_method = new KrollMethod(METHOD_signalCallbackWithSuccess) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_signalCallbackWithSuccess);

	Object __signalCallbackWithSuccess_tmp;
		KrollArgument __success_argument = new KrollArgument("success");
		java.lang.Boolean success;
			__success_argument.setOptional(false);
			
				__signalCallbackWithSuccess_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.Boolean.class);
				try {
					success = (java.lang.Boolean) __signalCallbackWithSuccess_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.Boolean type for argument \"success\" in \"signalCallbackWithSuccess\", but got " + __signalCallbackWithSuccess_tmp);
				}
		__success_argument.setValue(success);
		__invocation.addArgument(__success_argument);
	
	
	
	
	((KrollDemoProxy) __invocation.getProxy()).signalCallbackWithSuccess(
		__invocation
		,
		success
		);
		return KrollProxy.UNDEFINED;
				}
			};
			signalCallbackWithSuccess_method.setRunOnUiThread(true);
			bindings.put(METHOD_signalCallbackWithSuccess, signalCallbackWithSuccess_method);
			return signalCallbackWithSuccess_method;
		}


		return super.getBinding(name);
	}

	private static final String SHORT_API_NAME = "KrollDemo";
	private static final String FULL_API_NAME = "Moddevguide.KrollDemo";
	private static final String ID = "ti.moddevguide.KrollDemoProxy";

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
		return KrollDemoProxy.class;
	}

	public boolean isModule() {
		return false; 
	}
}