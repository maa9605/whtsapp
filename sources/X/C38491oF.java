package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1oF  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38491oF extends C1TD {
    public final Class A00;
    public final Constructor A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final Method A05;
    public final Method A06;

    /* JADX WARN: Multi-variable type inference failed */
    public C38491oF() {
        Method method;
        Method method2;
        Constructor constructor;
        Method method3;
        Method method4;
        Method method5;
        Class cls;
        Class<?> cls2 = null;
        try {
            Class<?> cls3 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls3.getConstructor(new Class[0]);
            Class<?> cls4 = Integer.TYPE;
            method3 = cls3.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls4, Boolean.TYPE, cls4, cls4, cls4, FontVariationAxis[].class);
            method4 = cls3.getMethod("addFontFromBuffer", ByteBuffer.class, cls4, FontVariationAxis[].class, cls4, cls4);
            method5 = cls3.getMethod("freeze", new Class[0]);
            method2 = cls3.getMethod("abortCreation", new Class[0]);
            method = A08(cls3);
            cls2 = cls3;
            cls = cls2;
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder A0P = C000200d.A0P("Unable to collect necessary methods for class ");
            A0P.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", A0P.toString(), e);
            method = cls2;
            method2 = cls2;
            constructor = cls2;
            method3 = cls2;
            method4 = cls2;
            method5 = cls2;
            cls = cls2;
        }
        this.A00 = cls;
        this.A01 = constructor;
        this.A03 = method3;
        this.A04 = method4;
        this.A06 = method5;
        this.A02 = method2;
        this.A05 = method;
    }

    @Override // X.C0X3
    public Typeface A02(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        boolean z;
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (!(method != null)) {
            return super.A02(context, resources, i, str, i2);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!A09(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.A02.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
            try {
                z = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused3) {
                z = false;
            }
            if (!z) {
                return null;
            }
            return A07(obj);
        }
        return null;
    }

    @Override // X.C1TD, X.C0X3
    public Typeface A05(Context context, CancellationSignal cancellationSignal, C12970kO[] c12970kOArr, int i) {
        Object obj;
        boolean z;
        Typeface A07;
        boolean z2;
        if (c12970kOArr.length < 1) {
            return null;
        }
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (!(method != null)) {
            C12970kO A04 = A04(c12970kOArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(A04.A03, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(A04.A02).setItalic(A04.A04).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C12970kO c12970kO : c12970kOArr) {
            if (c12970kO.A00 == 0) {
                Uri uri = c12970kO.A03;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, C07O.A0R(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        boolean z3 = false;
        for (C12970kO c12970kO2 : c12970kOArr) {
            Object obj2 = unmodifiableMap.get(c12970kO2.A03);
            if (obj2 != null) {
                try {
                    z2 = ((Boolean) this.A04.invoke(obj, obj2, Integer.valueOf(c12970kO2.A01), null, Integer.valueOf(c12970kO2.A02), Integer.valueOf(c12970kO2.A04 ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z2 = false;
                }
                if (!z2) {
                    try {
                        this.A02.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                    return null;
                }
                z3 = true;
            }
        }
        if (!z3) {
            try {
                this.A02.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused5) {
            }
            return null;
        }
        try {
            z = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused6) {
            z = false;
        }
        if (z && (A07 = A07(obj)) != null) {
            return Typeface.create(A07, i);
        }
        return null;
    }

    @Override // X.C1TD, X.C0X3
    public Typeface A06(Context context, C0X8 c0x8, Resources resources, int i) {
        Object obj;
        C0X7[] c0x7Arr;
        boolean z;
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (!(method != null)) {
            return super.A06(context, c0x8, resources, i);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C0X7 c0x7 : c0x8.A00) {
            if (!A09(context, obj, c0x7.A05, c0x7.A01, c0x7.A02, c0x7.A04 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0x7.A03))) {
                try {
                    this.A02.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        try {
            z = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            z = false;
        }
        if (!z) {
            return null;
        }
        return A07(obj);
    }

    public Typeface A07(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A00, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A05.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A08(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean A09(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.A03.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
