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

import ti.moddevguide.MethodsDemoProxy;


/* WARNING: this code is generated for binding methods in Android */
public class MethodsDemoProxyBindingGen
	extends ti.moddevguide.LifeCycleProxyBindingGen
{
	private static final String TAG = "MethodsDemoProxyBindingGen";

	private static final String METHOD_demoMethodRect = "demoMethodRect";
	private static final String METHOD_demoMethodArray = "demoMethodArray";
	private static final String METHOD_demoMethodNumberInt = "demoMethodNumberInt";
	private static final String METHOD_demoMethodRange = "demoMethodRange";
	private static final String METHOD_demoMethodDate = "demoMethodDate";
	private static final String METHOD_demoMethodColor = "demoMethodColor";
	private static final String METHOD_demoMethodDictionary = "demoMethodDictionary";
	private static final String METHOD_demoMethodString = "demoMethodString";
	private static final String METHOD_demoMethodNoReturn = "demoMethodNoReturn";
	private static final String METHOD_demoMethodBlob = "demoMethodBlob";
	private static final String METHOD_demoMethodOptionalArgs = "demoMethodOptionalArgs";
	private static final String METHOD_demoMethodFile = "demoMethodFile";
	private static final String METHOD_demoMethodNumberFloat = "demoMethodNumberFloat";
	private static final String METHOD_demoMethodPoint = "demoMethodPoint";
	private static final String METHOD_demoMethodNull = "demoMethodNull";
		
	public MethodsDemoProxyBindingGen() {
		super();
		// Constants are pre-bound
		
		bindings.put(METHOD_demoMethodRect, null);
		bindings.put(METHOD_demoMethodArray, null);
		bindings.put(METHOD_demoMethodNumberInt, null);
		bindings.put(METHOD_demoMethodRange, null);
		bindings.put(METHOD_demoMethodDate, null);
		bindings.put(METHOD_demoMethodColor, null);
		bindings.put(METHOD_demoMethodDictionary, null);
		bindings.put(METHOD_demoMethodString, null);
		bindings.put(METHOD_demoMethodNoReturn, null);
		bindings.put(METHOD_demoMethodBlob, null);
		bindings.put(METHOD_demoMethodOptionalArgs, null);
		bindings.put(METHOD_demoMethodFile, null);
		bindings.put(METHOD_demoMethodNumberFloat, null);
		bindings.put(METHOD_demoMethodPoint, null);
		bindings.put(METHOD_demoMethodNull, null);
		
	}

	public void bindContextSpecific(KrollBridge bridge, KrollProxy proxy) {
	}

	@Override
	public Object getBinding(String name) {
		Object value = bindings.get(name);
		if (value != null) { 
			return value;
		}






		// Methods
		if (name.equals(METHOD_demoMethodRect)) {
			KrollMethod demoMethodRect_method = new KrollMethod(METHOD_demoMethodRect) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodRect_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodRect_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		java.lang.Object[] args;
				args = KrollBindingUtils.getVarArgs(__invocation, __args, 0, org.appcelerator.kroll.KrollConverter.getInstance(), org.appcelerator.kroll.KrollConverter.getInstance()); 
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	org.appcelerator.kroll.KrollDict __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodRect(
		__invocation
		,
		args
		);
	return __demoMethodRect_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodRect, demoMethodRect_method);
			return demoMethodRect_method;
		}
		
		if (name.equals(METHOD_demoMethodArray)) {
			KrollMethod demoMethodArray_method = new KrollMethod(METHOD_demoMethodArray) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodArray_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodArray_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		java.lang.Object[] args;
				args = KrollBindingUtils.getVarArgs(__invocation, __args, 0, org.appcelerator.kroll.KrollConverter.getInstance(), org.appcelerator.kroll.KrollConverter.getInstance()); 
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	java.lang.Object[] __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodArray(
		__invocation
		,
		args
		);
	return __demoMethodArray_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodArray, demoMethodArray_method);
			return demoMethodArray_method;
		}
		
		if (name.equals(METHOD_demoMethodNumberInt)) {
			KrollMethod demoMethodNumberInt_method = new KrollMethod(METHOD_demoMethodNumberInt) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodNumberInt_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodNumberInt_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		java.lang.Object[] args;
				args = KrollBindingUtils.getVarArgs(__invocation, __args, 0, org.appcelerator.kroll.KrollConverter.getInstance(), org.appcelerator.kroll.KrollConverter.getInstance()); 
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	int __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodNumberInt(
		__invocation
		,
		args
		);
	return __demoMethodNumberInt_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodNumberInt, demoMethodNumberInt_method);
			return demoMethodNumberInt_method;
		}
		
		if (name.equals(METHOD_demoMethodRange)) {
			KrollMethod demoMethodRange_method = new KrollMethod(METHOD_demoMethodRange) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodRange_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodRange_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		java.lang.Object[] args;
				args = KrollBindingUtils.getVarArgs(__invocation, __args, 0, org.appcelerator.kroll.KrollConverter.getInstance(), org.appcelerator.kroll.KrollConverter.getInstance()); 
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	org.appcelerator.kroll.KrollDict __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodRange(
		__invocation
		,
		args
		);
	return __demoMethodRange_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodRange, demoMethodRange_method);
			return demoMethodRange_method;
		}
		
		if (name.equals(METHOD_demoMethodDate)) {
			KrollMethod demoMethodDate_method = new KrollMethod(METHOD_demoMethodDate) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_demoMethodDate);

	Object __demoMethodDate_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodDate_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		org.appcelerator.kroll.KrollDict args;
			__args_argument.setOptional(false);
			
				__demoMethodDate_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], org.appcelerator.kroll.KrollDict.class);
				try {
					args = (org.appcelerator.kroll.KrollDict) __demoMethodDate_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected org.appcelerator.kroll.KrollDict type for argument \"args\" in \"demoMethodDate\", but got " + __demoMethodDate_tmp);
				}
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	java.util.Date __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodDate(
		__invocation
		,
		args
		);
	return __demoMethodDate_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodDate, demoMethodDate_method);
			return demoMethodDate_method;
		}
		
		if (name.equals(METHOD_demoMethodColor)) {
			KrollMethod demoMethodColor_method = new KrollMethod(METHOD_demoMethodColor) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_demoMethodColor);

	Object __demoMethodColor_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodColor_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __color_argument = new KrollArgument("color");
		java.lang.String color;
			__color_argument.setOptional(false);
			
				__demoMethodColor_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.String.class);
				try {
					color = (java.lang.String) __demoMethodColor_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.String type for argument \"color\" in \"demoMethodColor\", but got " + __demoMethodColor_tmp);
				}
		__color_argument.setValue(color);
		__invocation.addArgument(__color_argument);
	
	
	int __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodColor(
		__invocation
		,
		color
		);
	return __demoMethodColor_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodColor, demoMethodColor_method);
			return demoMethodColor_method;
		}
		
		if (name.equals(METHOD_demoMethodDictionary)) {
			KrollMethod demoMethodDictionary_method = new KrollMethod(METHOD_demoMethodDictionary) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_demoMethodDictionary);

	Object __demoMethodDictionary_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodDictionary_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		java.lang.Object args;
			__args_argument.setOptional(false);
			
				__demoMethodDictionary_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.Object.class);
				try {
					args = (java.lang.Object) __demoMethodDictionary_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.Object type for argument \"args\" in \"demoMethodDictionary\", but got " + __demoMethodDictionary_tmp);
				}
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	org.appcelerator.kroll.KrollDict __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodDictionary(
		__invocation
		,
		args
		);
	return __demoMethodDictionary_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodDictionary, demoMethodDictionary_method);
			return demoMethodDictionary_method;
		}
		
		if (name.equals(METHOD_demoMethodString)) {
			KrollMethod demoMethodString_method = new KrollMethod(METHOD_demoMethodString) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodString_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodString_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		java.lang.Object[] args;
				args = KrollBindingUtils.getVarArgs(__invocation, __args, 0, org.appcelerator.kroll.KrollConverter.getInstance(), org.appcelerator.kroll.KrollConverter.getInstance()); 
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	java.lang.String __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodString(
		__invocation
		,
		args
		);
	return __demoMethodString_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodString, demoMethodString_method);
			return demoMethodString_method;
		}
		
		if (name.equals(METHOD_demoMethodNoReturn)) {
			KrollMethod demoMethodNoReturn_method = new KrollMethod(METHOD_demoMethodNoReturn) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodNoReturn_tmp;
	
	
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodNoReturn(
);
		return KrollProxy.UNDEFINED;
				}
			};
			bindings.put(METHOD_demoMethodNoReturn, demoMethodNoReturn_method);
			return demoMethodNoReturn_method;
		}
		
		if (name.equals(METHOD_demoMethodBlob)) {
			KrollMethod demoMethodBlob_method = new KrollMethod(METHOD_demoMethodBlob) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodBlob_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodBlob_converter = org.appcelerator.kroll.KrollConverter.getInstance();
	
	
	org.appcelerator.titanium.TiBlob __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodBlob(
		__invocation
		
);
	return __demoMethodBlob_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodBlob, demoMethodBlob_method);
			return demoMethodBlob_method;
		}
		
		if (name.equals(METHOD_demoMethodOptionalArgs)) {
			KrollMethod demoMethodOptionalArgs_method = new KrollMethod(METHOD_demoMethodOptionalArgs) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_demoMethodOptionalArgs);

	Object __demoMethodOptionalArgs_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodOptionalArgs_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __greeting_argument = new KrollArgument("greeting");
		java.lang.String greeting;
			__greeting_argument.setOptional(false);
			
				__demoMethodOptionalArgs_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.String.class);
				try {
					greeting = (java.lang.String) __demoMethodOptionalArgs_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.String type for argument \"greeting\" in \"demoMethodOptionalArgs\", but got " + __demoMethodOptionalArgs_tmp);
				}
		__greeting_argument.setValue(greeting);
		__invocation.addArgument(__greeting_argument);
		KrollArgument __name_argument = new KrollArgument("name");
		java.lang.Object name;
			__name_argument.setOptional(true);
			if (__args.length >= 2) {
			
				__demoMethodOptionalArgs_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[1], java.lang.Object.class);
				try {
					name = (java.lang.Object) __demoMethodOptionalArgs_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.Object type for argument \"name\" in \"demoMethodOptionalArgs\", but got " + __demoMethodOptionalArgs_tmp);
				}
			} else {
				__name_argument.setValueDefault(true);
				name = (java.lang.Object)
					org.appcelerator.kroll.KrollConverter.getInstance().getDefaultValue(java.lang.Object.class);
			}
		__name_argument.setValue(name);
		__invocation.addArgument(__name_argument);
	
	
	java.lang.String __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodOptionalArgs(
		__invocation
		,
		greeting,
				name
		);
	return __demoMethodOptionalArgs_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodOptionalArgs, demoMethodOptionalArgs_method);
			return demoMethodOptionalArgs_method;
		}
		
		if (name.equals(METHOD_demoMethodFile)) {
			KrollMethod demoMethodFile_method = new KrollMethod(METHOD_demoMethodFile) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	
	KrollBindingUtils.assertRequiredArgs(__args, 1, METHOD_demoMethodFile);

	Object __demoMethodFile_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodFile_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __arg_argument = new KrollArgument("arg");
		java.lang.String arg;
			__arg_argument.setOptional(false);
			
				__demoMethodFile_tmp = org.appcelerator.kroll.KrollConverter.getInstance().convertJavascript(__invocation, __args[0], java.lang.String.class);
				try {
					arg = (java.lang.String) __demoMethodFile_tmp;
				} catch (ClassCastException e) {
					throw new IllegalArgumentException("Expected java.lang.String type for argument \"arg\" in \"demoMethodFile\", but got " + __demoMethodFile_tmp);
				}
		__arg_argument.setValue(arg);
		__invocation.addArgument(__arg_argument);
	
	
	ti.modules.titanium.filesystem.FileProxy __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodFile(
		__invocation
		,
		arg
		);
	return __demoMethodFile_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodFile, demoMethodFile_method);
			return demoMethodFile_method;
		}
		
		if (name.equals(METHOD_demoMethodNumberFloat)) {
			KrollMethod demoMethodNumberFloat_method = new KrollMethod(METHOD_demoMethodNumberFloat) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodNumberFloat_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodNumberFloat_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		java.lang.Object[] args;
				args = KrollBindingUtils.getVarArgs(__invocation, __args, 0, org.appcelerator.kroll.KrollConverter.getInstance(), org.appcelerator.kroll.KrollConverter.getInstance()); 
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	float __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodNumberFloat(
		__invocation
		,
		args
		);
	return __demoMethodNumberFloat_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodNumberFloat, demoMethodNumberFloat_method);
			return demoMethodNumberFloat_method;
		}
		
		if (name.equals(METHOD_demoMethodPoint)) {
			KrollMethod demoMethodPoint_method = new KrollMethod(METHOD_demoMethodPoint) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodPoint_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodPoint_converter = org.appcelerator.kroll.KrollConverter.getInstance();
		KrollArgument __args_argument = new KrollArgument("args");
		java.lang.Object[] args;
				args = KrollBindingUtils.getVarArgs(__invocation, __args, 0, org.appcelerator.kroll.KrollConverter.getInstance(), org.appcelerator.kroll.KrollConverter.getInstance()); 
		__args_argument.setValue(args);
		__invocation.addArgument(__args_argument);
	
	
	org.appcelerator.kroll.KrollDict __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodPoint(
		__invocation
		,
		args
		);
	return __demoMethodPoint_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodPoint, demoMethodPoint_method);
			return demoMethodPoint_method;
		}
		
		if (name.equals(METHOD_demoMethodNull)) {
			KrollMethod demoMethodNull_method = new KrollMethod(METHOD_demoMethodNull) {
				public Object invoke(KrollInvocation __invocation, Object[] __args) throws Exception
				{
	

	Object __demoMethodNull_tmp;
	final org.appcelerator.kroll.KrollConverter __demoMethodNull_converter = org.appcelerator.kroll.KrollConverter.getInstance();
	
	
	java.lang.Object __retVal =
	
	
	((MethodsDemoProxy) __invocation.getProxy()).demoMethodNull(
		__invocation
		
);
	return __demoMethodNull_converter.convertNative(__invocation, __retVal);
				}
			};
			bindings.put(METHOD_demoMethodNull, demoMethodNull_method);
			return demoMethodNull_method;
		}


		return super.getBinding(name);
	}

	private static final String SHORT_API_NAME = "MethodsDemo";
	private static final String FULL_API_NAME = "Moddevguide.MethodsDemo";
	private static final String ID = "ti.moddevguide.MethodsDemoProxy";

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
		return MethodsDemoProxy.class;
	}

	public boolean isModule() {
		return false; 
	}
}