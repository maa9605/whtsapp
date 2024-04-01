package X;

import android.animation.TimeInterpolator;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2HB */
/* loaded from: classes2.dex */
public class C2HB extends C2HC {
    public final C1M7 A00;
    public final MediaViewBaseFragment A01;

    @Override // X.C2HC
    public void A08() {
    }

    public C2HB(C1M7 c1m7, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A00 = c1m7;
        this.A01 = mediaViewBaseFragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
        if (r2 == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (r6 != r11.getHeight()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
        X.C0AT.A0b(r11, new android.graphics.Rect(0, r2, r11.getWidth(), r6));
        r11.postDelayed(new java.lang.RunnableEBaseShape4S0100000_I0_4(r11, 12), r12.getResources().getInteger(17694721));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
        r3.addAll(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList A00(android.view.View r11, X.ActivityC02320As r12, X.C1M7 r13, java.lang.String r14) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.C0AT.A0e(r11, r14)
            java.lang.String r1 = r11.getTransitionName()
            X.0FK r0 = new X.0FK
            r0.<init>(r11, r1)
            r3.add(r0)
            r0 = 16908335(0x102002f, float:2.387736E-38)
            android.view.View r2 = r12.findViewById(r0)
            if (r2 == 0) goto L2a
            java.lang.String r1 = "statusBar"
            X.C0AT.A0e(r2, r1)
            X.0FK r0 = new X.0FK
            r0.<init>(r2, r1)
            r3.add(r0)
        L2a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r6 = r11.getHeight()
            r8 = 2
            int[] r7 = new int[r8]
            r11.getLocationOnScreen(r7)
            r0 = 2131364963(0x7f0a0c63, float:1.8349778E38)
            android.view.View r5 = r12.findViewById(r0)
            r10 = 1
            if (r5 == 0) goto L7e
            r0 = 2131890224(0x7f121030, float:1.9415134E38)
            java.lang.String r1 = r13.A00(r0)
            X.C0AT.A0e(r5, r1)
            X.0FK r0 = new X.0FK
            r0.<init>(r5, r1)
            r4.add(r0)
            int[] r9 = new int[r8]
            r5.getLocationOnScreen(r9)
            r0 = r7[r10]
            int r2 = r11.getHeight()
            int r2 = r2 + r0
            r1 = r9[r10]
            int r0 = r5.getHeight()
            int r0 = r0 + r1
            if (r2 <= r0) goto L7e
            r0 = r7[r10]
            int r2 = r11.getHeight()
            int r2 = r2 + r0
            r1 = r9[r10]
            int r0 = r5.getHeight()
            int r0 = r0 + r1
            int r2 = r2 - r0
            int r6 = r11.getHeight()
            int r6 = r6 - r2
        L7e:
            r0 = 2131364964(0x7f0a0c64, float:1.834978E38)
            android.view.View r2 = r12.findViewById(r0)
            r5 = 0
            if (r2 == 0) goto Ld4
            r0 = 2131890225(0x7f121031, float:1.9415136E38)
            java.lang.String r1 = r13.A00(r0)
            X.C0AT.A0e(r2, r1)
            X.0FK r0 = new X.0FK
            r0.<init>(r2, r1)
            r4.add(r0)
            int[] r1 = new int[r8]
            r2.getLocationOnScreen(r1)
            r0 = r7[r10]
            r2 = r1[r10]
            if (r0 >= r2) goto Ld4
            int r2 = r2 - r0
            if (r2 != 0) goto Lae
        La8:
            int r0 = r11.getHeight()
            if (r6 == r0) goto Ld0
        Lae:
            int r1 = r11.getWidth()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r5, r2, r1, r6)
            X.C0AT.A0b(r11, r0)
            r0 = 12
            java.lang.RunnableEBaseShape4S0100000_I0_4 r2 = new java.lang.RunnableEBaseShape4S0100000_I0_4
            r2.<init>(r11, r0)
            android.content.res.Resources r1 = r12.getResources()
            r0 = 17694721(0x10e0001, float:2.6081284E-38)
            int r0 = r1.getInteger(r0)
            long r0 = (long) r0
            r11.postDelayed(r2, r0)
        Ld0:
            r3.addAll(r4)
            return r3
        Ld4:
            r2 = 0
            goto La8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HB.A00(android.view.View, X.0As, X.1M7, java.lang.String):java.util.ArrayList");
    }

    public static /* synthetic */ void A01(View view) {
        C0AT.A0b(view, null);
    }

    public static void A02(final ActivityC02320As activityC02320As, C1M7 c1m7, Intent intent, View view, String str) {
        C08950cN A00 = C08950cN.A00(activityC02320As, (C0FK[]) A00(view, activityC02320As, c1m7, str).toArray(new C0FK[0]));
        activityC02320As.setExitSharedElementCallback(new SharedElementCallback() { // from class: X.319
            @Override // android.app.SharedElementCallback
            public void onMapSharedElements(List list, Map map) {
                View A05;
                super.onMapSharedElements(list, map);
                ActivityC02320As activityC02320As2 = ActivityC02320As.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (!map.containsKey(str2) && (A05 = C2HC.A05(activityC02320As2.getWindow().getDecorView(), str2)) != null) {
                        map.put(str2, A05);
                    }
                }
            }

            @Override // android.app.SharedElementCallback
            public void onSharedElementEnd(List list, List list2, List list3) {
                super.onSharedElementEnd(list, list2, list3);
                ActivityC02320As.this.setExitSharedElementCallback(null);
            }
        });
        activityC02320As.startActivity(intent, A00.A01());
    }

    @Override // X.C2HC
    public void A09(final Bundle bundle) {
        PhotoView A0x;
        MediaViewBaseFragment mediaViewBaseFragment = this.A01;
        Object A11 = mediaViewBaseFragment.A11(mediaViewBaseFragment.A09.getCurrentItem());
        if (A11 == null) {
            mediaViewBaseFragment.A13();
            return;
        }
        int childCount = mediaViewBaseFragment.A09.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mediaViewBaseFragment.A09.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                if (viewGroup.getChildCount() > 0 && (A0x = mediaViewBaseFragment.A0x(viewGroup)) != null) {
                    if (A11.equals(viewGroup.getTag())) {
                        C0AT.A0e(A0x, C000200d.A0H("thumb-transition-", A11.toString()));
                    } else {
                        C0AT.A0e(A0x, null);
                    }
                }
            }
        }
        if (mediaViewBaseFragment.A10() != null && !A11.equals(mediaViewBaseFragment.A10())) {
            mediaViewBaseFragment.A06().A05 = new AbstractC12840kA() { // from class: X.3IT
                @Override // X.AbstractC12840kA
                public void A01(List list, Map map) {
                    Bundle bundle2;
                    ArrayList<String> stringArrayList;
                    PhotoView A0y;
                    MediaViewBaseFragment mediaViewBaseFragment2 = C2HB.this.A01;
                    Object A112 = mediaViewBaseFragment2.A11(mediaViewBaseFragment2.A09.getCurrentItem());
                    if (A112 == null || (bundle2 = bundle) == null || (stringArrayList = bundle2.getStringArrayList("visible_shared_elements")) == null || !stringArrayList.contains(C000200d.A0H("thumb-transition-", A112.toString())) || (A0y = mediaViewBaseFragment2.A0y(A112)) == null) {
                        return;
                    }
                    Object A10 = mediaViewBaseFragment2.A10();
                    if (A10 != null) {
                        list.remove(C000200d.A0H("thumb-transition-", A10.toString()));
                        list.add(C000200d.A0H("thumb-transition-", A112.toString()));
                        map.put(C000200d.A0H("thumb-transition-", A112.toString()), A0y);
                        return;
                    }
                    throw null;
                }
            };
        }
        if (mediaViewBaseFragment.A1B()) {
            mediaViewBaseFragment.A0A().A0Q();
        } else {
            mediaViewBaseFragment.A13();
        }
    }

    @Override // X.C2HC
    public void A0A(final InterfaceC48642Gc interfaceC48642Gc, Bundle bundle) {
        final MediaViewBaseFragment mediaViewBaseFragment = this.A01;
        mediaViewBaseFragment.A03.setVisibility(4);
        mediaViewBaseFragment.A19(false, 0);
        mediaViewBaseFragment.A06.setVisibility(0);
        mediaViewBaseFragment.A0G = false;
        final View decorView = mediaViewBaseFragment.A0A().getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.31A
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                View view = decorView;
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                View findViewById = view.findViewById(16908335);
                if (findViewById != null) {
                    C0AT.A0e(findViewById, "statusBar");
                }
                View findViewById2 = view.findViewById(16908336);
                if (findViewById2 != null) {
                    C0AT.A0e(findViewById2, "navigationBar");
                    return true;
                }
                return true;
            }
        });
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        C1M7 c1m7 = this.A00;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(linearInterpolator);
        changeBounds.excludeTarget(c1m7.A00(R.string.transition_clipper_top), true);
        changeBounds.excludeTarget(c1m7.A00(R.string.transition_clipper_bottom), true);
        ChangeTransform changeTransform = new ChangeTransform();
        changeTransform.setInterpolator(linearInterpolator);
        ChangeImageTransform changeImageTransform = new ChangeImageTransform();
        changeImageTransform.setInterpolator(linearInterpolator);
        mediaViewBaseFragment.A00();
        AnonymousClass318 anonymousClass318 = new AnonymousClass318(c1m7, true);
        anonymousClass318.setInterpolator(linearInterpolator);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setInterpolator((TimeInterpolator) linearInterpolator);
        transitionSet.setDuration(220L);
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(changeTransform);
        transitionSet.addTransition(changeImageTransform);
        transitionSet.addTransition(anonymousClass318);
        mediaViewBaseFragment.A00();
        AnonymousClass318 anonymousClass3182 = new AnonymousClass318(c1m7, false);
        anonymousClass3182.setInterpolator(linearInterpolator);
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.setInterpolator((TimeInterpolator) linearInterpolator);
        transitionSet2.setDuration(220L);
        transitionSet2.addTransition(changeBounds);
        transitionSet2.addTransition(changeTransform);
        transitionSet2.addTransition(changeImageTransform);
        transitionSet2.addTransition(anonymousClass3182);
        Fade fade = new Fade();
        fade.excludeTarget(16908335, true);
        fade.excludeTarget(16908336, true);
        Fade fade2 = new Fade();
        fade2.excludeTarget(16908335, true);
        fade2.excludeTarget(16908336, true);
        if (mediaViewBaseFragment.A1B()) {
            ActivityC02330At A0A = mediaViewBaseFragment.A0A();
            Window window = A0A.getWindow();
            A0A.A0S();
            window.setSharedElementEnterTransition(transitionSet);
            window.setSharedElementReturnTransition(transitionSet2);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
            transitionSet.addListener((Transition.TransitionListener) new C1M6() { // from class: X.3IR
                @Override // X.C1M6, android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    MediaViewBaseFragment mediaViewBaseFragment2 = MediaViewBaseFragment.this;
                    ActivityC02330At A09 = mediaViewBaseFragment2.A09();
                    if (A09 == null || mediaViewBaseFragment2.A0g || A09.isFinishing()) {
                        return;
                    }
                    mediaViewBaseFragment2.A03.setVisibility(0);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(600L);
                    mediaViewBaseFragment2.A03.startAnimation(alphaAnimation);
                    mediaViewBaseFragment2.A1A(true, true);
                    PhotoView A0y = mediaViewBaseFragment2.A0y(mediaViewBaseFragment2.A11(mediaViewBaseFragment2.A09.getCurrentItem()));
                    if (A0y != null) {
                        A0y.A08(true);
                    }
                    interfaceC48642Gc.APt(true);
                }
            });
            transitionSet2.addListener((Transition.TransitionListener) new C1M6() { // from class: X.3IS
                @Override // X.C1M6, android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    InterfaceC48642Gc.this.APt(false);
                }
            });
            return;
        }
        mediaViewBaseFragment.A06().A0A = transitionSet;
        mediaViewBaseFragment.A06().A0B = transitionSet2;
        mediaViewBaseFragment.A06().A07 = fade;
        mediaViewBaseFragment.A06().A09 = fade2;
        fade.addListener(new C1M6() { // from class: X.3IR
            @Override // X.C1M6, android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                MediaViewBaseFragment mediaViewBaseFragment2 = MediaViewBaseFragment.this;
                ActivityC02330At A09 = mediaViewBaseFragment2.A09();
                if (A09 == null || mediaViewBaseFragment2.A0g || A09.isFinishing()) {
                    return;
                }
                mediaViewBaseFragment2.A03.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(600L);
                mediaViewBaseFragment2.A03.startAnimation(alphaAnimation);
                mediaViewBaseFragment2.A1A(true, true);
                PhotoView A0y = mediaViewBaseFragment2.A0y(mediaViewBaseFragment2.A11(mediaViewBaseFragment2.A09.getCurrentItem()));
                if (A0y != null) {
                    A0y.A08(true);
                }
                interfaceC48642Gc.APt(true);
            }
        });
        fade2.addListener(new C1M6() { // from class: X.3IS
            @Override // X.C1M6, android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                InterfaceC48642Gc.this.APt(false);
            }
        });
    }
}
