package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1TD  reason: invalid class name */
/* loaded from: classes.dex */
public class C1TD extends C0X3 {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    /* JADX WARN: Multi-variable type inference failed */
    public static void A02() {
        Method method;
        Class cls;
        Method method2;
        if (A04) {
            return;
        }
        A04 = true;
        Constructor<?> constructor = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Method method3 = cls2.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            constructor = constructor2;
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
            method2 = method3;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = constructor;
            cls = constructor;
            method2 = constructor;
        }
        A01 = constructor;
        A00 = cls;
        A02 = method2;
        A03 = method;
    }

    @Override // X.C0X3
    public Typeface A05(Context context, CancellationSignal cancellationSignal, C12970kO[] c12970kOArr, int i) {
        File file;
        String readlink;
        if (c12970kOArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(A04(c12970kOArr, i).A03, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("/proc/self/fd/");
                sb.append(openFileDescriptor.getFd());
                readlink = Os.readlink(sb.toString());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file == null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface A032 = super.A03(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return A032;
            }
            file = null;
            if (file == null) {
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface A0322 = super.A03(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return A0322;
        } catch (IOException unused2) {
            return null;
        }
    }

    @Override // X.C0X3
    public Typeface A06(Context context, C0X8 c0x8, Resources resources, int i) {
        C0X7[] c0x7Arr;
        A02();
        try {
            Object newInstance = A01.newInstance(new Object[0]);
            for (C0X7 c0x7 : c0x8.A00) {
                File A0O = C07O.A0O(context);
                if (A0O == null) {
                    return null;
                }
                try {
                    if (!C07O.A16(A0O, resources, c0x7.A00)) {
                        return null;
                    }
                    String path = A0O.getPath();
                    int i2 = c0x7.A02;
                    boolean z = c0x7.A04;
                    A02();
                    try {
                        if (!((Boolean) A02.invoke(newInstance, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                            return null;
                        }
                        A0O.delete();
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    A0O.delete();
                }
            }
            A02();
            try {
                Object newInstance2 = Array.newInstance(A00, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) A03.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
