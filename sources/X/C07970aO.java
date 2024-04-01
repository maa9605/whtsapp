package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.0aO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C07970aO extends ContextWrapper {
    public static ArrayList A01;
    public static final Object A02 = new Object();
    public final Resources A00;

    public C07970aO(Context context) {
        super(context);
        final Resources resources = context.getResources();
        this.A00 = new C08040aV(this, resources) { // from class: X.0aU
            public final WeakReference A00;

            {
                super(resources);
                this.A00 = new WeakReference(this);
            }

            @Override // android.content.res.Resources
            public Drawable getDrawable(int i) {
                Drawable drawable = super.A00.getDrawable(i);
                Context context2 = (Context) this.A00.get();
                if (drawable != null && context2 != null) {
                    C06720Us.A01().A08(context2, i, drawable);
                }
                return drawable;
            }
        };
    }

    public static Context A00(Context context) {
        C07970aO c07970aO;
        if (!(context instanceof C07970aO) && !(context.getResources() instanceof C08030aU)) {
            context.getResources();
            if (Build.VERSION.SDK_INT < 21) {
                synchronized (A02) {
                    ArrayList arrayList = A01;
                    if (arrayList == null) {
                        A01 = new ArrayList();
                    } else {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            WeakReference weakReference = (WeakReference) arrayList.get(size);
                            if (weakReference == null || weakReference.get() == null) {
                                arrayList.remove(size);
                            }
                        }
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            WeakReference weakReference2 = (WeakReference) A01.get(size2);
                            if (weakReference2 != null && (c07970aO = (C07970aO) weakReference2.get()) != null && c07970aO.getBaseContext() == context) {
                                return c07970aO;
                            }
                        }
                    }
                    C07970aO c07970aO2 = new C07970aO(context);
                    A01.add(new WeakReference(c07970aO2));
                    return c07970aO2;
                }
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.A00.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.A00;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
    }
}
