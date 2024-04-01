package androidx.appcompat.app;

import X.C006702y;
import X.C02700Cn;
import X.C04850Mb;
import X.C04860Me;
import X.C0CP;
import X.C0S5;
import X.C0UY;
import X.C10990h0;
import X.C11030h4;
import X.C11130hE;
import X.C1S9;
import X.C1SA;
import X.C1SB;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public final Object[] mConstructorArgs = new Object[2];
    public static final Class[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {16843375};
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final Map sConstructorMap = new C006702y();

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View.OnClickListener(view, string) { // from class: X.0gL
                    public Context A00;
                    public Method A01;
                    public final View A02;
                    public final String A03;

                    {
                        this.A02 = view;
                        this.A03 = string;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        String obj;
                        Method method = this.A01;
                        if (method == null) {
                            View view3 = this.A02;
                            for (Context context2 = view3.getContext(); context2 != null; context2 = ((ContextWrapper) context2).getBaseContext()) {
                                try {
                                    if (!context2.isRestricted() && (method = context2.getClass().getMethod(this.A03, View.class)) != null) {
                                        this.A01 = method;
                                        this.A00 = context2;
                                    }
                                } catch (NoSuchMethodException unused) {
                                }
                                if (!(context2 instanceof ContextWrapper)) {
                                    break;
                                }
                            }
                            int id = view3.getId();
                            if (id == -1) {
                                obj = "";
                            } else {
                                StringBuilder A0P = C000200d.A0P(" with id '");
                                A0P.append(view3.getContext().getResources().getResourceEntryName(id));
                                A0P.append("'");
                                obj = A0P.toString();
                            }
                            StringBuilder A0P2 = C000200d.A0P("Could not find method ");
                            A0P2.append(this.A03);
                            A0P2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                            A0P2.append(view3.getClass());
                            A0P2.append(obj);
                            throw new IllegalStateException(A0P2.toString());
                        }
                        try {
                            method.invoke(this.A00, view2);
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
                        } catch (InvocationTargetException e2) {
                            throw new IllegalStateException("Could not execute method for android:onClick", e2);
                        }
                    }
                });
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C1S9 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1S9(context, attributeSet);
    }

    public C1SA createButton(Context context, AttributeSet attributeSet) {
        return new C1SA(context, attributeSet);
    }

    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public C10990h0 createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C10990h0(context, attributeSet);
    }

    public C04850Mb createEditText(Context context, AttributeSet attributeSet) {
        return new C04850Mb(context, attributeSet);
    }

    public C04860Me createImageButton(Context context, AttributeSet attributeSet) {
        return new C04860Me(context, attributeSet);
    }

    public C0S5 createImageView(Context context, AttributeSet attributeSet) {
        return new C0S5(context, attributeSet);
    }

    public C1SB createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C1SB(context, attributeSet);
    }

    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public C11030h4 createRatingBar(Context context, AttributeSet attributeSet) {
        return new C11030h4(context, attributeSet);
    }

    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    public C02700Cn createTextView(Context context, AttributeSet attributeSet) {
        return new C02700Cn(context, attributeSet);
    }

    public C11130hE createToggleButton(Context context, AttributeSet attributeSet) {
        return new C11130hE(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0024, code lost:
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0038, code lost:
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View createView(android.view.View r3, java.lang.String r4, android.content.Context r5, android.util.AttributeSet r6, boolean r7, boolean r8, boolean r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatViewInflater.createView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String obj;
        Constructor constructor = (Constructor) sConstructorMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    obj = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                obj = str;
            }
            constructor = Class.forName(obj, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            sConstructorMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                View createViewByPrefix = createViewByPrefix(context, str, strArr[i]);
                if (createViewByPrefix != null) {
                    return createViewByPrefix;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0UY.A0d, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof C0CP) && ((C0CP) context).A00 == resourceId)) ? context : new C0CP(context, resourceId);
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" asked to inflate view for <");
        sb.append(str);
        sb.append(">, but returned null");
        throw new IllegalStateException(sb.toString());
    }
}
