package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: X.1TE  reason: invalid class name */
/* loaded from: classes.dex */
public class C1TE extends C0X3 {
    public static final Class A00;
    public static final Constructor A01;
    public static final Method A02;
    public static final Method A03;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Class<?> cls3 = Integer.TYPE;
            Method method3 = cls2.getMethod("addFontWeightStyle", ByteBuffer.class, cls3, List.class, cls3, Boolean.TYPE);
            constructor = constructor2;
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
            method2 = method3;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = constructor;
            method = constructor;
            method2 = constructor;
        }
        A01 = constructor;
        A00 = cls;
        A02 = method2;
        A03 = method;
    }

    public static boolean A02(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) A02.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // X.C0X3
    public Typeface A05(Context context, CancellationSignal cancellationSignal, C12970kO[] c12970kOArr, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C006802z c006802z = new C006802z();
        for (C12970kO c12970kO : c12970kOArr) {
            Uri uri = c12970kO.A03;
            ByteBuffer byteBuffer = (ByteBuffer) c006802z.get(uri);
            if (byteBuffer == null) {
                byteBuffer = C07O.A0R(context, cancellationSignal, uri);
                c006802z.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !A02(obj, byteBuffer, c12970kO.A01, c12970kO.A02, c12970kO.A04)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(A00, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) A03.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }

    @Override // X.C0X3
    public Typeface A06(Context context, C0X8 c0x8, Resources resources, int i) {
        Object obj;
        C0X7[] c0x7Arr;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C0X7 c0x7 : c0x8.A00) {
            int i2 = c0x7.A00;
            File A0O = C07O.A0O(context);
            if (A0O != null) {
                try {
                    if (C07O.A16(A0O, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(A0O);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                    break;
                                } catch (Throwable th2) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable unused2) {
                                    }
                                    throw th2;
                                    break;
                                }
                            }
                        } catch (IOException unused3) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !A02(obj, mappedByteBuffer, c0x7.A01, c0x7.A02, c0x7.A04)) {
                            return null;
                        }
                    }
                } finally {
                    A0O.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(A00, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) A03.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused4) {
            return null;
        }
    }
}
