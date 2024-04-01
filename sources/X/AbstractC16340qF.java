package X;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0qF */
/* loaded from: classes.dex */
public abstract class AbstractC16340qF {
    public final C006702y A00;
    public final C006702y A01;
    public final C006702y A02;

    public abstract AbstractC16340qF A02();

    public abstract void A05();

    public abstract void A06(int i);

    public abstract boolean A09(int i);

    public AbstractC16340qF(C006702y c006702y, C006702y c006702y2, C006702y c006702y3) {
        this.A01 = c006702y;
        this.A02 = c006702y2;
        this.A00 = c006702y3;
    }

    public int A00(int i, int i2) {
        return !A09(i2) ? i : ((C1VA) this).A05.readInt();
    }

    public Parcelable A01(Parcelable parcelable, int i) {
        return !A09(i) ? parcelable : ((C1VA) this).A05.readParcelable(C1VA.class.getClassLoader());
    }

    public C0M5 A03() {
        String readString = ((C1VA) this).A05.readString();
        if (readString == null) {
            return null;
        }
        AbstractC16340qF A02 = A02();
        try {
            C006702y c006702y = this.A01;
            Method method = (Method) c006702y.getOrDefault(readString, null);
            if (method == null) {
                System.currentTimeMillis();
                method = Class.forName(readString, true, AbstractC16340qF.class.getClassLoader()).getDeclaredMethod("read", AbstractC16340qF.class);
                c006702y.put(readString, method);
            }
            return (C0M5) method.invoke(null, A02);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw e4.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Class A04(Class cls) {
        C006702y c006702y = this.A00;
        String name = cls.getName();
        Class cls2 = (Class) c006702y.getOrDefault(name, null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            c006702y.put(name, cls3);
            return cls3;
        }
        return cls2;
    }

    public void A07(int i, int i2) {
        A06(i2);
        ((C1VA) this).A05.writeInt(i);
    }

    public void A08(C0M5 c0m5) {
        if (c0m5 == null) {
            ((C1VA) this).A05.writeString(null);
            return;
        }
        try {
            Class<?> cls = c0m5.getClass();
            ((C1VA) this).A05.writeString(A04(cls).getName());
            AbstractC16340qF A02 = A02();
            try {
                C006702y c006702y = this.A02;
                String name = cls.getName();
                Method method = (Method) c006702y.getOrDefault(name, null);
                if (method == null) {
                    Class A04 = A04(cls);
                    System.currentTimeMillis();
                    method = A04.getDeclaredMethod("write", cls, AbstractC16340qF.class);
                    c006702y.put(name, method);
                }
                method.invoke(null, c0m5, A02);
                A02.A05();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw e4.getCause();
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append(c0m5.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e5);
        }
    }
}
