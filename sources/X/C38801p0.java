package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.1p0 */
/* loaded from: classes.dex */
public class C38801p0 extends AbstractC07290Xq implements Animatable {
    public Animator.AnimatorListener A00;
    public ArgbEvaluator A01;
    public Context A02;
    public C16300qA A03;
    public ArrayList A04;
    public final Drawable.Callback A05;

    public C38801p0() {
        this(null);
    }

    public C38801p0(Context context) {
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        this.A05 = new Drawable.Callback() { // from class: X.0q8
            {
                C38801p0.this = this;
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                C38801p0.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C38801p0.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C38801p0.this.unscheduleSelf(runnable);
            }
        };
        this.A02 = context;
        this.A03 = new C16300qA();
    }

    public static C38801p0 A00(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C38801p0 c38801p0 = new C38801p0(context);
            Drawable A0D = C002701i.A0D(context.getResources(), i, context.getTheme());
            ((AbstractC07290Xq) c38801p0).A00 = A0D;
            A0D.setCallback(c38801p0.A05);
            new C16310qB(((AbstractC07290Xq) c38801p0).A00.getConstantState());
            return c38801p0;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    Resources resources = context.getResources();
                    Resources.Theme theme = context.getTheme();
                    C38801p0 c38801p02 = new C38801p0(context);
                    c38801p02.inflate(resources, xml, asAttributeSet, theme);
                    return c38801p02;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("AnimatedVDCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("AnimatedVDCompat", "parser error", e2);
            return null;
        }
    }

    public final void A01(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                A01(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                ArgbEvaluator argbEvaluator = this.A01;
                if (argbEvaluator == null) {
                    argbEvaluator = new ArgbEvaluator();
                    this.A01 = argbEvaluator;
                }
                objectAnimator.setEvaluator(argbEvaluator);
            }
        }
    }

    public void A02(final AbstractC09660eW abstractC09660eW) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
            Animatable2.AnimationCallback animationCallback = abstractC09660eW.A00;
            if (animationCallback == null) {
                animationCallback = new Animatable2.AnimationCallback() { // from class: X.0q7
                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationEnd(Drawable drawable2) {
                        abstractC09660eW.A00(drawable2);
                    }

                    @Override // android.graphics.drawable.Animatable2.AnimationCallback
                    public void onAnimationStart(Drawable drawable2) {
                    }
                };
                abstractC09660eW.A00 = animationCallback;
            }
            animatedVectorDrawable.registerAnimationCallback(animationCallback);
            return;
        }
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A04 = arrayList;
        }
        if (arrayList.contains(abstractC09660eW)) {
            return;
        }
        this.A04.add(abstractC09660eW);
        Animator.AnimatorListener animatorListener = this.A00;
        if (animatorListener == null) {
            animatorListener = new AnimatorListenerAdapter() { // from class: X.0q9
                {
                    C38801p0.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    C38801p0 c38801p0 = C38801p0.this;
                    ArrayList arrayList2 = new ArrayList(c38801p0.A04);
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ((AbstractC09660eW) arrayList2.get(i)).A00(c38801p0);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    ArrayList arrayList2 = new ArrayList(C38801p0.this.A04);
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        arrayList2.get(i);
                    }
                }
            };
            this.A00 = animatorListener;
        }
        this.A03.A00.addListener(animatorListener);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = super.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return drawable.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.A03.A02.draw(canvas);
        if (this.A03.A00.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                return drawable.getAlpha();
            }
            return 0;
        }
        return this.A03.A02.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return drawable.getColorFilter();
            }
            return null;
        }
        return this.A03.A02.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = super.A00;
        if (drawable == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C16310qB(drawable.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A03.A02.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.A03.A02.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.A03.A02.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser xmlResourceParser;
        Animator A0P;
        Drawable drawable = super.A00;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray A0G = C07O.A0G(resources, theme, attributeSet, C07N.A00);
                    int resourceId = A0G.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C07280Xp A00 = C07280Xp.A00(resources, resourceId, theme);
                        A00.A03 = false;
                        A00.setCallback(this.A05);
                        C07280Xp c07280Xp = this.A03.A02;
                        if (c07280Xp != null) {
                            c07280Xp.setCallback(null);
                        }
                        this.A03.A02 = A00;
                    }
                    A0G.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C07N.A01);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i, 0);
                    if (resourceId2 != 0) {
                        Context context = this.A02;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                A0P = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        xmlResourceParser = resources2.getAnimation(resourceId2);
                                        try {
                                            try {
                                                try {
                                                    A0P = C07K.A0P(context, resources2, theme2, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0);
                                                    xmlResourceParser.close();
                                                } catch (IOException e) {
                                                    e = e;
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Can't load animation resource ID #0x");
                                                    sb.append(Integer.toHexString(resourceId2));
                                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                                                    notFoundException.initCause(e);
                                                    throw notFoundException;
                                                } catch (XmlPullParserException e2) {
                                                    e = e2;
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("Can't load animation resource ID #0x");
                                                    sb2.append(Integer.toHexString(resourceId2));
                                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
                                                    notFoundException2.initCause(e);
                                                    throw notFoundException2;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                            } catch (XmlPullParserException e4) {
                                                e = e4;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            if (xmlResourceParser != null) {
                                                xmlResourceParser.close();
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e5) {
                                        e = e5;
                                    } catch (XmlPullParserException e6) {
                                        e = e6;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    xmlResourceParser = null;
                                }
                            }
                            A0P.setTarget(this.A03.A02.A02.A08.A0E.getOrDefault(string, null));
                            if (Build.VERSION.SDK_INT < 21) {
                                A01(A0P);
                            }
                            C16300qA c16300qA = this.A03;
                            ArrayList arrayList = c16300qA.A03;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                c16300qA.A03 = arrayList;
                                c16300qA.A01 = new C006702y();
                            }
                            arrayList.add(A0P);
                            c16300qA.A01.put(A0P, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        C16300qA c16300qA2 = this.A03;
        if (c16300qA2.A00 == null) {
            c16300qA2.A00 = new AnimatorSet();
        }
        c16300qA2.A00.playTogether(c16300qA2.A03);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return C07O.A13(drawable);
        }
        return this.A03.A02.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.A03.A00.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.A03.A02.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.A03.A02.setBounds(rect);
        }
    }

    @Override // X.AbstractC07290Xq, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.A03.A02.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.A03.A02.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.A03.A02.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C07O.A0b(drawable, z);
            return;
        }
        C07280Xp c07280Xp = this.A03.A02;
        Drawable drawable2 = ((AbstractC07290Xq) c07280Xp).A00;
        if (drawable2 != null) {
            C07O.A0b(drawable2, z);
        } else {
            c07280Xp.A02.A09 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        C07280Xp c07280Xp = this.A03.A02;
        Drawable drawable2 = ((AbstractC07290Xq) c07280Xp).A00;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        c07280Xp.A00 = colorFilter;
        c07280Xp.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTint(int i) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C07O.A0X(drawable, i);
        } else {
            this.A03.A02.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C07O.A0Z(drawable, colorStateList);
        } else {
            this.A03.A02.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, X.C0DE
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            C07O.A0a(drawable, mode);
        } else {
            this.A03.A02.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = super.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.A03.A02.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.A03.A00.isStarted()) {
        } else {
            this.A03.A00.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = super.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.A03.A00.end();
        }
    }
}
