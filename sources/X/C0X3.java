package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0X3 */
/* loaded from: classes.dex */
public class C0X3 {
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static long A00(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    public static Object A01(Object[] objArr, int i, InterfaceC12900kG interfaceC12900kG) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(interfaceC12900kG.AE2(obj2) - i2) << 1) + (interfaceC12900kG.AFU(obj2) == z ? 0 : 1);
            if (obj == null || i3 > abs) {
                obj = obj2;
                i3 = abs;
            }
        }
        return obj;
    }

    public Typeface A02(Context context, Resources resources, int i, String str, int i2) {
        File A0O = C07O.A0O(context);
        if (A0O == null) {
            return null;
        }
        try {
            if (C07O.A16(A0O, resources, i)) {
                return Typeface.createFromFile(A0O.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A0O.delete();
        }
    }

    public Typeface A03(Context context, InputStream inputStream) {
        File A0O = C07O.A0O(context);
        if (A0O == null) {
            return null;
        }
        try {
            if (C07O.A17(A0O, inputStream)) {
                return Typeface.createFromFile(A0O.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A0O.delete();
        }
    }

    public C12970kO A04(C12970kO[] c12970kOArr, int i) {
        return (C12970kO) A01(c12970kOArr, i, new InterfaceC12900kG() { // from class: X.1TG
            @Override // X.InterfaceC12900kG
            public int AE2(Object obj) {
                return ((C12970kO) obj).A02;
            }

            @Override // X.InterfaceC12900kG
            public boolean AFU(Object obj) {
                return ((C12970kO) obj).A04;
            }
        });
    }

    public Typeface A05(Context context, CancellationSignal cancellationSignal, C12970kO[] c12970kOArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c12970kOArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(A04(c12970kOArr, i).A03);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface A03 = A03(context, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return A03;
        } catch (IOException unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public Typeface A06(Context context, C0X8 c0x8, Resources resources, int i) {
        C0X7 c0x7 = (C0X7) A01(c0x8.A00, i, new InterfaceC12900kG() { // from class: X.1TH
            @Override // X.InterfaceC12900kG
            public int AE2(Object obj) {
                return ((C0X7) obj).A02;
            }

            @Override // X.InterfaceC12900kG
            public boolean AFU(Object obj) {
                return ((C0X7) obj).A04;
            }
        });
        if (c0x7 == null) {
            return null;
        }
        int i2 = c0x7.A00;
        Typeface A02 = C0X2.A01.A02(context, resources, i2, c0x7.A05, i);
        if (A02 != null) {
            C0X2.A00.A08(C0X2.A01(resources, i2, i), A02);
        }
        long A00 = A00(A02);
        if (A00 != 0) {
            this.A00.put(Long.valueOf(A00), c0x8);
        }
        return A02;
    }
}
