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

import ti.moddevguide.ModdevguideModule;


/* WARNING: this code is generated for binding methods in Android */
public class ModdevguideModuleBindingGen
	extends org.appcelerator.kroll.KrollModuleBindingGen
{
	private static final String TAG = "ModdevguideModuleBindingGen";

	private static final String CONST_DEMO_STRING = "DEMO_STRING";
	private static final String CONST_DEMO_INTEGER = "DEMO_INTEGER";
	private static final String CONST_DEMO_BOOLEAN = "DEMO_BOOLEAN";
	private static final String CREATE_DemoView = "createDemoView";
	private static final String CREATE_KrollDemo = "createKrollDemo";
	private static final String CREATE_LifeCycle = "createLifeCycle";
	private static final String CREATE_MethodsDemo = "createMethodsDemo";
	private static final String CREATE_ParametersDemo = "createParametersDemo";
	private static final String METHOD_loadImageFromApplication = "loadImageFromApplication";
	private static final String METHOD_loadImageFromModule = "loadImageFromModule";
		
	public ModdevguideModuleBindingGen() {
		super();
		// Constants are pre-bound
		bindings.put(CONST_DEMO_STRING, ModdevguideModule.DEMO_STRING);
		bindings.put(CONST_DEMO_INTEGER, ModdevguideModule.DEMO_INTEGER);
		bindings.put(CONST_DEMO_BOOLEAN, ModdevguideModule.DEMO_BOOLEAN);
		
		bindings.put(CREATE_DemoView, null);
		bindings.put(CREATE_KrollDemo, null);
		bindings.put(CREATE_LifeCycle, null);
		bindings.put(CREATE_MethodsDemo, null);
		bindings.put(CREATE_ParametersDemo, null);
		bindings.put(METHOD_loadImageFromApplication, null);
		bindings.put(METHOD_loadImageFromModule, null);
		
	}

	public void bindContextSpecific(KrollBridge bridge, KrollProxy proxy) {
	}

	@Override
	public Object getBinding(String name) {
		Object value = bindings.get(name);
		if (value != null) { 
			return value;
		}

		// Proxy create methods
		if (name.equals(CREATE_DemoView)) {
			KrollBindingUtils.KrollProxyCreator creator = new KrollBindingUtils.KrollProxyCreator() {
				public KrollProxy create(TiContext context) {
					return new ti.moddevguide.DemoViewProxy(context);
				}
			};
			KrollMethod createDemoView_method = KrollBindingUtils.createCreateMethod(CREATE_DemoView, creator);
			bindings.put(CREATE_DemoView, createDemoView_method);
			return createDemoView_method;
		}
		
		if (name.equals(CREATE_KrollDemo)) {
			KrollBindingUtils.KrollProxyCreator creator = new KrollBindingUtils.KrollProxyCreator() {
				public KrollProxy create(TiContext context) {
					return new ti.moddevguide.KrollDemoProxy(context);
				}
			};
			KrollMethod createKrollDemo_method = KrollBindingUtils.createCreateMethod(CREATE_KrollDemo, creator);
			bindings.put(CREATE_KrollDemo, createKrollDemo_method);
			return createKrollDemo_method;
		}
		
		if (name.equals(CREATE_LifeCycle)) {
			KrollBindingUtils.KrollProxyCreator creator = new KrollBindingUtils.KrollProxyCreator() {
				public KrollProxy create(TiContext context) {
					return new ti.moddevguide.LifeCycleProxy(context);
				}
			};
			KrollMethod createLifeCycle_method = KrollBindingUtils.createCreateMethod(CREATE_LifeCycle, creator);
			bindings.put(CREATE_LifeCycle, createLifeCycle_method);
			return createLifeCycle_method;
		}
		
		if (name.equals(CREATE_MethodsDemo)) {
			KrollBindingUtils.KrollProxyCreator creator = new KrollBindingUtils.KrollProxyCreator() {
				public KrollProxy create(TiContext context) {
					return new ti.moddevguide.MethodsDemoProxy(context);
				}
			};
			KrollMethod createMethodsDemo_method = KrollBindingUtils.createCreateMethod(CREATE_MethodsDemo, creator);
			bindings.put(CREATE_MethodsDemo, createMethodsDemo_method);
			return createMethodsDemo_method;
		}
		
		if (name.equals(CREATE_ParametersDemo)) {
			KrollBindingUtils.KrollProxyCreator creator = new KrollBindingUtils.KrollProxyCreator() {
				public KrollProxy create(TiContext context) {
					return new ti.moddevguide.ParametersDemoProxy(context);
				}
			};
			KrollMethod createParametersDemo_method = KrollBindingUtils.createCreateMethod(CREATE_ParametersDemo, creator);
			bindings.put(CREATE_ParametersDemo, createParametersDemo_method);
			return createParametersDemo_method;
		}





		// Methods
		if (name.equals(METHOD_loadImageFromApplication)) {
			KrollMethod loadImageFromApplication_method = new KrollMethod(METHOD_loadImageFromApplication) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_loadImageFromApplication);

	Object __loadImageFromApplication_tmp;
	final org.appcelerator.kroll.KrollConverter __loadImageFromApplication_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __imageName_argument = new KrollArgument("imageName");
		java.lang.String imageName;
			__imageName_argument.setOptional(false);
			
				__loadImageFromApplication_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.String.class);
				try {
					imageName = (java.lang.String) __loadImageFromApplication_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.String type for argument \"imageName\" in \"loadImageFromApplication\", but got " + __loadImageFromApplication_tmp);
				}
		__imageName_argument.setValue(imageName);
		__invocation.addArgument(__imageName_argument);
	
	
	org.appcelerator.titanium.TiBlob __retVal =
	
	
	((ModdevguideModule) __invocation.getProxy()).loadImageFromApplication(
		__invocation
		,
		imageName
		);
	return __loadImageFromApplication_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_loadImageFromApplication, loadImageFromApplication_method);
			return loadImageFromApplication_method;
		}
		
		if (name.equals(METHOD_loadImageFromModule)) {
			KrollMethod loadImageFromModule_method = new KrollMethod(METHOD_loadImageFromModule) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_loadImageFromModule);

	Object __loadImageFromModule_tmp;
	final org.appcelerator.kroll.KrollConverter __loadImageFromModule_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __imageName_argument = new KrollArgument("imageName");
		java.lang.String imageName;
			__imageName_argument.setOptional(false);
			
				__loadImageFromModule_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.String.class);
				try {
					imageName = (java.lang.String) __loadImageFromModule_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.String type for argument \"imageName\" in \"loadImageFromModule\", but got " + __loadImageFromModule_tmp);
				}
		__imageName_argument.setValue(imageName);
		__invocation.addArgument(__imageName_argument);
	
	
	org.appcelerator.titanium.TiBlob __retVal =
	
	
	((ModdevguideModule) __invocation.getProxy()).loadImageFromModule(
		__invocation
		,
		imageName
		);
	return __loadImageFromModule_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_loadImageFromModule, loadImageFromModule_method);
			return loadImageFromModule_method;
		}


		return super.getBinding(name);
	}

	private static final String SHORT_API_NAME = "Moddevguide";
	private static final String FULL_API_NAME = "Moddevguide";
	private static final String ID = "ti.moddevguide";

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
		return new ModdevguideModule(context);
	}

	public Class<? extends KrollProxy> getProxyClass() {
		return ModdevguideModule.class;
	}

	public boolean isModule() {
		return true; 
	}
}