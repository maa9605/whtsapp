package X;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.0gZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C10740gZ {
    public char A00;
    public char A01;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public Menu A0G;
    public AbstractC13060kX A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public CharSequence A0K;
    public CharSequence A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final /* synthetic */ C0UW A0V;
    public ColorStateList A0E = null;
    public PorterDuff.Mode A0F = null;
    public int A04 = 0;
    public int A02 = 0;
    public int A05 = 0;
    public int A03 = 0;
    public boolean A0Q = true;
    public boolean A0P = true;

    public C10740gZ(C0UW c0uw, Menu menu) {
        this.A0V = c0uw;
        this.A0G = menu;
    }

    public final Object A00(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.A0V.A00.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Cannot instantiate class: ");
            sb.append(str);
            Log.w("SupportMenuInflater", sb.toString(), e);
            return null;
        }
    }

    public final void A01(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.A0S).setVisible(this.A0U).setEnabled(this.A0T).setCheckable(this.A09 >= 1).setTitleCondensed(this.A0K).setIcon(this.A0A);
        int i = this.A0D;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.A0O != null) {
            C0UW c0uw = this.A0V;
            if (!c0uw.A00.isRestricted()) {
                final Object obj = c0uw.A01;
                if (obj == null) {
                    obj = c0uw.A00;
                    if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                        obj = ((ContextWrapper) obj).getBaseContext();
                        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                            obj = ((ContextWrapper) obj).getBaseContext();
                            if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
                                obj = c0uw.A00(((ContextWrapper) obj).getBaseContext());
                            }
                        }
                    }
                    c0uw.A01 = obj;
                }
                final String str = this.A0O;
                menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(obj, str) { // from class: X.0gY
                    public static final Class[] A02 = {MenuItem.class};
                    public Object A00;
                    public Method A01;

                    {
                        this.A00 = obj;
                        Class<?> cls = obj.getClass();
                        try {
                            this.A01 = cls.getMethod(str, A02);
                        } catch (Exception e) {
                            StringBuilder A0W = C000200d.A0W("Couldn't resolve menu item onClick handler ", str, " in class ");
                            A0W.append(cls.getName());
                            InflateException inflateException = new InflateException(A0W.toString());
                            inflateException.initCause(e);
                            throw inflateException;
                        }
                    }

                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public boolean onMenuItemClick(MenuItem menuItem2) {
                        try {
                            if (this.A01.getReturnType() == Boolean.TYPE) {
                                return ((Boolean) this.A01.invoke(this.A00, menuItem2)).booleanValue();
                            }
                            this.A01.invoke(this.A00, menuItem2);
                            return true;
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                });
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        boolean z2 = menuItem instanceof C28421Rt;
        if (this.A09 >= 2) {
            if (z2) {
                C28421Rt c28421Rt = (C28421Rt) menuItem;
                c28421Rt.A02 = (c28421Rt.A02 & (-5)) | 4;
            } else if (menuItem instanceof C1Rw) {
                C1Rw c1Rw = (C1Rw) menuItem;
                try {
                    Method method = c1Rw.A00;
                    if (method == null) {
                        method = c1Rw.A01.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        c1Rw.A00 = method;
                    }
                    method.invoke(c1Rw.A01, Boolean.TRUE);
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str2 = this.A0N;
        if (str2 != null) {
            menuItem.setActionView((View) A00(str2, C0UW.A05, this.A0V.A03));
            z = true;
        }
        int i2 = this.A06;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        AbstractC13060kX abstractC13060kX = this.A0H;
        if (abstractC13060kX != null) {
            if (menuItem instanceof InterfaceMenuItemC07810a4) {
                ((InterfaceMenuItemC07810a4) menuItem).ATw(abstractC13060kX);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A0I;
        boolean z3 = menuItem instanceof InterfaceMenuItemC07810a4;
        if (z3) {
            ((InterfaceMenuItemC07810a4) menuItem).ASs(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.A0L;
        if (z3) {
            ((InterfaceMenuItemC07810a4) menuItem).AU2(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.A00;
        int i3 = this.A07;
        if (z3) {
            ((InterfaceMenuItemC07810a4) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.A01;
        int i4 = this.A0C;
        if (z3) {
            ((InterfaceMenuItemC07810a4) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.A0F;
        if (mode != null) {
            if (z3) {
                ((InterfaceMenuItemC07810a4) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.A0E;
        if (colorStateList != null) {
            if (z3) {
                ((InterfaceMenuItemC07810a4) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT < 26) {
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
