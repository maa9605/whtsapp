package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0X2  reason: invalid class name */
/* loaded from: classes.dex */
public class C0X2 {
    public static final C06F A00;
    public static final C0X3 A01;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            A01 = new C0X3() { // from class: X.1TF
                @Override // X.C0X3
                public Typeface A02(Context context, Resources resources, int i2, String str, int i3) {
                    try {
                        return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(new Font.Builder(resources, i2).build()).build()).setStyle(new FontStyle((i3 & 1) != 0 ? 700 : 400, (i3 & 2) != 0 ? 1 : 0)).build();
                    } catch (IOException unused) {
                        return null;
                    }
                }

                @Override // X.C0X3
                public Typeface A03(Context context, InputStream inputStream) {
                    throw new RuntimeException("Do not use this function in API 29 or later.");
                }

                @Override // X.C0X3
                public C12970kO A04(C12970kO[] c12970kOArr, int i2) {
                    throw new RuntimeException("Do not use this function in API 29 or later.");
                }

                @Override // X.C0X3
                public Typeface A05(Context context, CancellationSignal cancellationSignal, C12970kO[] c12970kOArr, int i2) {
                    ContentResolver contentResolver = context.getContentResolver();
                    int length = c12970kOArr.length;
                    FontFamily.Builder builder = null;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        C12970kO c12970kO = c12970kOArr[i3];
                        try {
                            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(c12970kO.A03, "r", cancellationSignal);
                            if (openFileDescriptor != null) {
                                Font build = new Font.Builder(openFileDescriptor).setWeight(c12970kO.A02).setSlant(c12970kO.A04 ? 1 : 0).setTtcIndex(c12970kO.A01).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(build);
                                } else {
                                    builder.addFont(build);
                                }
                                openFileDescriptor.close();
                            }
                        } catch (IOException unused) {
                        }
                        i3++;
                    }
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0)).build();
                }

                @Override // X.C0X3
                public Typeface A06(Context context, C0X8 c0x8, Resources resources, int i2) {
                    C0X7[] c0x7Arr = c0x8.A00;
                    int length = c0x7Arr.length;
                    FontFamily.Builder builder = null;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        C0X7 c0x7 = c0x7Arr[i3];
                        try {
                            Font build = new Font.Builder(resources, c0x7.A00).setWeight(c0x7.A02).setSlant(c0x7.A04 ? 1 : 0).setTtcIndex(c0x7.A01).setFontVariationSettings(c0x7.A03).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                        } catch (IOException unused) {
                        }
                        i3++;
                    }
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0)).build();
                }
            };
        } else if (i >= 28) {
            A01 = new C38491oF() { // from class: X.1M8
                @Override // X.C38491oF
                public Typeface A07(Object obj) {
                    try {
                        Object newInstance = Array.newInstance(((C38491oF) this).A00, 1);
                        Array.set(newInstance, 0, obj);
                        return (Typeface) this.A05.invoke(null, newInstance, "sans-serif", -1, -1);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }

                @Override // X.C38491oF
                public Method A08(Class cls) {
                    Class cls2 = Integer.TYPE;
                    Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                }
            };
        } else if (i >= 26) {
            A01 = new C38491oF();
        } else {
            if (i >= 24) {
                Method method = C1TE.A02;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    A01 = new C1TE();
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                A01 = new C1TD();
            } else {
                A01 = new C0X3();
            }
        }
        A00 = new C06F(16);
    }

    public static Typeface A00(Context context, Typeface typeface, int i) {
        C0X8 c0x8;
        Typeface A06;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 21) {
                C0X3 c0x3 = A01;
                long A002 = C0X3.A00(typeface);
                if (A002 != 0 && (c0x8 = (C0X8) c0x3.A00.get(Long.valueOf(A002))) != null && (A06 = c0x3.A06(context, c0x8, context.getResources(), i)) != null) {
                    return A06;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static String A01(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }
}
