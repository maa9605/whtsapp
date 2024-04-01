package com.whatsapp.status.playback;

import X.AbstractC53812hY;
import X.AbstractC53822hZ;
import X.AbstractC71693Xc;
import X.AnonymousClass011;
import X.AnonymousClass094;
import X.C003101m;
import X.C011405q;
import X.C018308n;
import X.C02F;
import X.C0AT;
import X.C0BA;
import X.C0CB;
import X.C0EB;
import X.C0Hr;
import X.C0LD;
import X.C0V5;
import X.C0Z8;
import X.C0ZT;
import X.C2EQ;
import X.C2Q2;
import X.C2Q3;
import X.C2Q4;
import X.C2Q5;
import X.C37521mY;
import X.C3XI;
import X.C3XN;
import X.C3XO;
import X.C3XV;
import X.C48242Em;
import X.C48252En;
import X.C48262Eo;
import X.C48652Gd;
import X.C71713Xe;
import X.C82003po;
import X.C82113pz;
import X.C86863ye;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class StatusPlaybackActivity extends C2Q2 implements C2Q3 {
    public static final Interpolator A0N = new Interpolator() { // from class: X.3XK
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int A01;
    public int A04;
    public long A06;
    public ViewPager A07;
    public C02F A08;
    public C0EB A09;
    public AnonymousClass094 A0A;
    public C0CB A0B;
    public C2EQ A0C;
    public C3XN A0D;
    public C3XO A0E;
    public C2Q5 A0F;
    public C2Q4 A0G;
    public Runnable A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0L;
    public int A05 = -1;
    public final Rect A0M = new Rect();
    public float A00 = 3.5f;
    public int A02 = 0;
    public int A03 = 0;
    public boolean A0K = false;

    public final StatusPlaybackFragment A1P(int i) {
        C3XN c3xn = this.A0D;
        if (c3xn != null && i >= 0 && i < c3xn.A00.size()) {
            return A1Q((C82003po) this.A0D.A00.get(i));
        }
        return null;
    }

    public final StatusPlaybackFragment A1Q(C82003po c82003po) {
        String rawString;
        if (c82003po != null && (rawString = c82003po.A00.A0A.getRawString()) != null) {
            for (C0BA c0ba : A0t()) {
                if (c0ba instanceof StatusPlaybackFragment) {
                    StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) c0ba;
                    if (rawString.equals(statusPlaybackFragment.A0y())) {
                        return statusPlaybackFragment;
                    }
                }
            }
        }
        return null;
    }

    public final void A1R(String str, int i, int i2) {
        int A00 = this.A0D.A00(str);
        if (A00 >= 0 && A00 < this.A0D.A00.size()) {
            if (A00 == this.A07.getCurrentItem()) {
                if (!this.A0I && A00 != this.A0D.A00.size() - 1) {
                    this.A0H = new C3XI(this, str, i, i2);
                    AL9(str, true, i, i2);
                    return;
                }
                finish();
                return;
            }
            this.A0D.A00.remove(A00);
            int i3 = this.A01;
            if (A00 <= i3) {
                this.A01 = i3 - 1;
            }
            int i4 = this.A05;
            if (A00 <= i4) {
                this.A05 = i4 - 1;
            }
            this.A07.A0V.A04();
        }
    }

    @Override // X.C2Q3
    public int AAp() {
        return this.A03;
    }

    @Override // X.C2Q3
    public void AK9(int i) {
        this.A03 = i;
        if (i != 1) {
            finish();
            return;
        }
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // X.C2Q3
    public boolean AL9(String str, boolean z, int i, int i2) {
        int A00 = this.A0D.A00(str);
        if (z) {
            this.A03 = i;
            this.A02 = i2;
            if (A00 < this.A0D.A00.size() - 1 && !this.A0I) {
                this.A0E.A00 = this.A00;
                this.A00 = 3.5f;
                this.A07.A0B(A00 + 1, true);
                this.A0E.A00 = 0.0f;
                return true;
            }
            finish();
            return true;
        } else if (A00 <= 0 || this.A0I) {
            return false;
        } else {
            this.A0E.A00 = this.A00;
            this.A00 = 3.5f;
            this.A03 = i;
            this.A02 = i2;
            this.A07.A0B(A00 - 1, true);
            this.A0E.A00 = 0.0f;
            return true;
        }
    }

    @Override // X.C2Q3
    public void ALC(String str) {
        A1R(str, 0, 0);
    }

    @Override // X.C2Q3
    public void ALD(String str) {
        StatusPlaybackFragment A1Q;
        C82003po c82003po = (C82003po) this.A0D.A00.get(this.A07.getCurrentItem());
        if (!c82003po.A00.A0A.getRawString().equals(str) || (A1Q = A1Q(c82003po)) == null) {
            return;
        }
        A1Q.A10();
        A1Q.A12(1);
    }

    @Override // X.C2Q3
    public void AOm(float f) {
        float f2 = f < 0.9f ? 0.0f : 1.0f - ((1.0f - f) * 10.0f);
        View findViewById = findViewById(R.id.video_playback_container_overlay);
        findViewById.setVisibility(0);
        findViewById.setBackgroundColor(((int) (f2 * 255.0f)) << 24);
        findViewById(R.id.video_playback_container).setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x003a  */
    @Override // X.ActivityC02320As, X.ActivityC02350Av, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r11) {
        /*
            r10 = this;
            int r5 = r11.getKeyCode()
            int r0 = r11.getAction()
            if (r0 != 0) goto L7a
            r1 = 24
            if (r5 == r1) goto L12
            r0 = 25
            if (r5 != r0) goto L7a
        L12:
            X.2Q5 r9 = r10.A0F
            r4 = 0
            r3 = 1
            r2 = 0
            if (r5 != r1) goto L1a
            r2 = 1
        L1a:
            X.02E r0 = r9.A06
            android.media.AudioManager r8 = r0.A0A()
            if (r8 == 0) goto L59
            r7 = 3
            int r6 = r8.getStreamVolume(r7)
            int r5 = r8.getStreamMaxVolume(r7)
            r1 = 16
            if (r2 == 0) goto L4e
            if (r6 >= r5) goto L57
            int r2 = r6 + 1
            r8.adjustSuggestedStreamVolume(r3, r7, r1)
        L36:
            java.util.List r0 = r9.A04
            if (r0 == 0) goto L59
            java.util.Iterator r1 = r0.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r1.next()
            X.3Xf r0 = (X.InterfaceC71723Xf) r0
            r0.AHX(r6, r2, r5)
            goto L3e
        L4e:
            if (r6 <= 0) goto L57
            int r2 = r6 + (-1)
            r0 = -1
            r8.adjustSuggestedStreamVolume(r0, r7, r1)
            goto L36
        L57:
            r2 = r6
            goto L36
        L59:
            X.2Q5 r1 = r10.A0F
            boolean r0 = r1.A05
            if (r0 == 0) goto L79
            r1.A05 = r4
            java.util.List r0 = r1.A04
            if (r0 == 0) goto L79
            java.util.Iterator r1 = r0.iterator()
        L69:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r1.next()
            X.3Xf r0 = (X.InterfaceC71723Xf) r0
            r0.AHU(r4)
            goto L69
        L79:
            return r3
        L7a:
            boolean r0 = super.dispatchKeyEvent(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.StatusPlaybackActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // X.ActivityC02290Ap, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0E.isFinished() || this.A0E.timePassed() >= (this.A0E.getDuration() >> 1)) {
            if (motionEvent.getActionMasked() == 0) {
                long eventTime = motionEvent.getEventTime() - this.A06;
                this.A00 = (eventTime == 0 || eventTime > 1000) ? 3.5f : ((((float) eventTime) * 2.5f) / 1000.0f) + 1.0f;
                this.A06 = motionEvent.getEventTime();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0J = true;
            C0ZT c0zt = this.A07.A0V;
            if (c0zt != null) {
                c0zt.A04();
                this.A07.setCurrentItem(this.A04);
                return;
            }
            throw null;
        } else {
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        AbstractC53822hZ A17;
        boolean z;
        StatusPlaybackFragment A1P = A1P(this.A07.getCurrentItem());
        if (A1P != null && (A17 = ((StatusPlaybackContactFragment) A1P).A17()) != null) {
            AbstractC53812hY abstractC53812hY = (AbstractC53812hY) A17;
            BottomSheetBehavior bottomSheetBehavior = abstractC53812hY.A00;
            if (bottomSheetBehavior.A0B == 3) {
                bottomSheetBehavior.A0O(4);
                return;
            }
            AbstractC71693Xc A0C = abstractC53812hY.A0C();
            MediaCaptionTextView mediaCaptionTextView = A0C.A0F;
            if (((ReadMoreTextView) mediaCaptionTextView).A06) {
                mediaCaptionTextView.setExpanded(false);
                A0C.A02.setVisibility(A0C.A0F.getVisibility());
                abstractC53812hY.A0G();
                return;
            }
            C3XV A0B = abstractC53812hY.A0B();
            if (A0B instanceof C82113pz) {
                C82113pz c82113pz = (C82113pz) A0B;
                View view = c82113pz.A00;
                if (view == null || view.getVisibility() != 0) {
                    z = false;
                } else {
                    c82113pz.A00.performClick();
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        this.A03 = 3;
        super.onBackPressed();
    }

    @Override // X.C2Q2, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        C018308n.A05(getWindow());
        setContentView(R.layout.status_playback);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(134217728);
            C0AT.A0d(findViewById(R.id.root_view), new C0V5() { // from class: X.3pc
                {
                    StatusPlaybackActivity.this = this;
                }

                @Override // X.C0V5
                public final C07110Wv AHK(View view, C07110Wv c07110Wv) {
                    StatusPlaybackActivity statusPlaybackActivity = StatusPlaybackActivity.this;
                    Rect rect = statusPlaybackActivity.A0M;
                    rect.set(c07110Wv.A02(), c07110Wv.A04(), c07110Wv.A03(), c07110Wv.A01());
                    for (C0BA c0ba : statusPlaybackActivity.A0t()) {
                        if (c0ba instanceof StatusPlaybackFragment) {
                            ((StatusPlaybackFragment) c0ba).A13(rect);
                        }
                    }
                    return c07110Wv;
                }
            });
        }
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        this.A07 = viewPager;
        this.A0E = new C3XO(viewPager.getContext(), A0N);
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this.A07, this.A0E);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException unused) {
        }
        UserJid A06 = C003101m.A06(getIntent().getStringExtra("jid"));
        AnonymousClass094 A02 = C0LD.A02(getIntent());
        this.A0A = A02;
        boolean z = false;
        this.A04 = 0;
        C3XN c3xn = new C3XN();
        if (A02 != null) {
            C0Hr A07 = this.A09.A07(A06);
            if (A07 != null && !A07.A03()) {
                c3xn.A01(new C82003po(A07.A01()));
            }
        } else if (C011405q.A03(A06)) {
            C0Hr A062 = this.A09.A06();
            if (A062 != null && !A062.A03()) {
                c3xn.A01(new C82003po(A062.A01()));
            }
        } else if (this.A0B.A07(A06).A0G) {
            C0Hr A072 = this.A09.A07(A06);
            if (A072 != null && !A072.A03()) {
                c3xn.A01(new C82003po(A072.A01()));
            }
        } else {
            if (getIntent().hasExtra("sorted_jids")) {
                C0EB c0eb = this.A09;
                c0eb.A0C();
                Map unmodifiableMap = Collections.unmodifiableMap(c0eb.A05);
                Iterator it = ((AbstractCollection) C003101m.A0F(UserJid.class, getIntent().getStringArrayListExtra("sorted_jids"))).iterator();
                while (it.hasNext()) {
                    c3xn.A01(new C82003po((C0Hr) unmodifiableMap.get(it.next())));
                }
                this.A0L = getIntent().getBooleanExtra("unseen_only", false);
            } else {
                List A08 = this.A09.A08();
                Collections.sort(A08, new Comparator() { // from class: X.3XH
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        C0Hr c0Hr = (C0Hr) obj;
                        C0Hr c0Hr2 = (C0Hr) obj2;
                        UserJid userJid = c0Hr.A0A;
                        if (C011405q.A03(userJid)) {
                            return -1;
                        }
                        UserJid userJid2 = c0Hr2.A0A;
                        if (C011405q.A03(userJid2)) {
                            return 1;
                        }
                        int i = c0Hr.A01;
                        if (i <= 0 || c0Hr2.A01 != 0) {
                            if (i != 0 || c0Hr2.A01 <= 0) {
                                if (C003101m.A0Y(userJid)) {
                                    return -1;
                                }
                                if (C003101m.A0Y(userJid2)) {
                                    return 1;
                                }
                                return -(c0Hr.A07 > c0Hr2.A07 ? 1 : (c0Hr.A07 == c0Hr2.A07 ? 0 : -1));
                            }
                            return 1;
                        }
                        return -1;
                    }
                });
                ArrayList arrayList = new ArrayList();
                AbstractCollection abstractCollection = (AbstractCollection) A08;
                Iterator it2 = abstractCollection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0Hr c0Hr = (C0Hr) it2.next();
                    if (A06.equals(c0Hr.A0A)) {
                        this.A0L = c0Hr.A01 > 0;
                    }
                }
                Iterator it3 = abstractCollection.iterator();
                while (it3.hasNext()) {
                    C0Hr c0Hr2 = (C0Hr) it3.next();
                    UserJid userJid = c0Hr2.A0A;
                    if (C011405q.A03(userJid)) {
                        arrayList.add(c0Hr2);
                    } else if (this.A0L && c0Hr2.A01 == 0) {
                        arrayList.add(c0Hr2);
                    } else if (this.A0B.A07(userJid).A0G) {
                        arrayList.add(c0Hr2);
                    }
                }
                abstractCollection.removeAll(arrayList);
                Iterator it4 = abstractCollection.iterator();
                while (it4.hasNext()) {
                    c3xn.A01(new C82003po((C0Hr) it4.next()));
                }
            }
            this.A0I = !this.A0L;
            this.A04 = c3xn.A00(A06.getRawString());
        }
        if (c3xn.A00.size() == 0) {
            StringBuilder sb = new StringBuilder("statusplaybackactivity/create/no statuses for ");
            sb.append(A06);
            Log.i(sb.toString());
            finish();
            return;
        }
        boolean A063 = this.A08.A06();
        this.A0J = A063;
        if (!A063) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.permission_storage_need_write_access_on_status_view_v30;
            if (i < 30) {
                i2 = R.string.permission_storage_need_write_access_on_status_view;
            }
            RequestPermissionActivity.A06(this, R.string.permission_storage_need_write_access_on_status_view_request, i2, true, 151);
        }
        this.A0D = c3xn;
        this.A07.setAdapter(new C86863ye(this, A0N()));
        this.A07.setCurrentItem(this.A04);
        this.A01 = this.A04;
        this.A07.A0F(new C0Z8() { // from class: X.3pp
            public int A00 = -1;
            public StatusPlaybackFragment A01 = null;
            public final Rect A04 = new Rect();
            public final Rect A03 = new Rect();
            public boolean A02 = false;

            {
                StatusPlaybackActivity.this = this;
            }

            @Override // X.C0Z8
            public void AMg(int i3) {
                char c;
                StatusPlaybackActivity statusPlaybackActivity = StatusPlaybackActivity.this;
                if (i3 != 0) {
                    if (!statusPlaybackActivity.A0K) {
                        statusPlaybackActivity.A0K = true;
                        this.A00 = statusPlaybackActivity.A07.getCurrentItem();
                    }
                } else {
                    statusPlaybackActivity.A0K = false;
                    this.A00 = -1;
                    this.A02 = false;
                    this.A01 = null;
                    for (C0BA c0ba : statusPlaybackActivity.A0t()) {
                        if (c0ba instanceof StatusPlaybackFragment) {
                            StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) c0ba;
                            if (!statusPlaybackFragment.A00) {
                                C71703Xd.A00(((StatusPlaybackContactFragment) statusPlaybackFragment).A17(), 0);
                            }
                        }
                    }
                    this.A02 = false;
                    Runnable runnable = statusPlaybackActivity.A0H;
                    if (runnable != null) {
                        runnable.run();
                        statusPlaybackActivity.A0H = null;
                    }
                }
                if (i3 == 0) {
                    c = 0;
                } else if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("Invalid scrollState value from ViewPager");
                    }
                    c = 2;
                } else {
                    c = 1;
                }
                for (C0BA c0ba2 : statusPlaybackActivity.A0t()) {
                    if (c0ba2 instanceof StatusPlaybackFragment) {
                        StatusPlaybackBaseFragment statusPlaybackBaseFragment = (StatusPlaybackBaseFragment) ((StatusPlaybackFragment) c0ba2);
                        if (statusPlaybackBaseFragment == null) {
                            throw null;
                        }
                        if (c != 0) {
                            if (c == 1 || c == 2) {
                                statusPlaybackBaseFragment.A16(true);
                            }
                        } else {
                            statusPlaybackBaseFragment.A16(false);
                        }
                    }
                }
            }

            @Override // X.C0Z8
            public void AMh(int i3, float f, int i4) {
                View view;
                StatusPlaybackActivity statusPlaybackActivity;
                ViewPager viewPager2;
                if (Float.isNaN(f) || f == 0.0f || f == 1.0f) {
                    return;
                }
                boolean z2 = i3 == this.A00;
                if (this.A02) {
                    return;
                }
                StatusPlaybackFragment statusPlaybackFragment = this.A01;
                if (statusPlaybackFragment == null) {
                    StatusPlaybackActivity statusPlaybackActivity2 = StatusPlaybackActivity.this;
                    if (z2) {
                        i3++;
                    }
                    statusPlaybackFragment = statusPlaybackActivity2.A1P(i3);
                    this.A01 = statusPlaybackFragment;
                }
                if (statusPlaybackFragment == null || statusPlaybackFragment.A00 || (view = statusPlaybackFragment.A0A) == null || (viewPager2 = (statusPlaybackActivity = StatusPlaybackActivity.this).A07) == null || !viewPager2.isShown() || !view.isShown()) {
                    return;
                }
                Rect rect = this.A04;
                viewPager2.getGlobalVisibleRect(rect);
                Rect rect2 = this.A03;
                view.getGlobalVisibleRect(rect2);
                if (rect.intersect(rect2)) {
                    StatusPlaybackFragment statusPlaybackFragment2 = this.A01;
                    int i5 = statusPlaybackActivity.A02;
                    if (i5 != 0) {
                        statusPlaybackActivity.A02 = 0;
                    } else {
                        i5 = 2;
                        if (z2) {
                            i5 = 3;
                        }
                    }
                    statusPlaybackFragment2.A12(i5);
                    this.A02 = true;
                }
            }

            @Override // X.C0Z8
            public void AMi(int i3) {
                boolean z2;
                StatusPlaybackActivity statusPlaybackActivity = StatusPlaybackActivity.this;
                if (i3 == statusPlaybackActivity.A01) {
                    return;
                }
                statusPlaybackActivity.A0I = false;
                C82003po c82003po = (C82003po) statusPlaybackActivity.A0D.A00.get(i3);
                if (c82003po != null) {
                    Iterator it5 = statusPlaybackActivity.A0t().iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        C0BA c0ba = (C0BA) it5.next();
                        if (c0ba instanceof StatusPlaybackFragment) {
                            StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) c0ba;
                            if (!c82003po.A00.A0A.getRawString().equals(statusPlaybackFragment.A0y()) && statusPlaybackFragment.A00) {
                                z2 = i3 > statusPlaybackActivity.A01;
                                int i4 = statusPlaybackActivity.A03;
                                if (i4 != 0) {
                                    statusPlaybackActivity.A03 = 0;
                                } else {
                                    i4 = 6;
                                    if (z2) {
                                        i4 = 7;
                                    }
                                }
                                C71703Xd.A00(((StatusPlaybackContactFragment) statusPlaybackFragment).A17(), i4);
                                statusPlaybackFragment.A11();
                            }
                        }
                    }
                    StatusPlaybackFragment A1Q = statusPlaybackActivity.A1Q(c82003po);
                    if (A1Q != null && !A1Q.A00) {
                        A1Q.A10();
                        z2 = i3 > statusPlaybackActivity.A01;
                        int i5 = statusPlaybackActivity.A02;
                        if (i5 != 0) {
                            statusPlaybackActivity.A02 = 0;
                        } else {
                            i5 = 2;
                            if (z2) {
                                i5 = 3;
                            }
                        }
                        A1Q.A12(i5);
                    }
                }
                statusPlaybackActivity.A01 = i3;
            }
        });
        this.A07.setOnTouchListener(new View.OnTouchListener() { // from class: X.3XJ
            {
                StatusPlaybackActivity.this = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                StatusPlaybackFragment A1P;
                StatusPlaybackActivity statusPlaybackActivity = StatusPlaybackActivity.this;
                int action = motionEvent.getAction() & 255;
                if ((action == 1 || action == 3) && motionEvent.getPointerCount() == 1 && (A1P = statusPlaybackActivity.A1P(statusPlaybackActivity.A07.getCurrentItem())) != null) {
                    StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) A1P;
                    if (((StatusPlaybackBaseFragment) statusPlaybackContactFragment).A07 || statusPlaybackContactFragment.A0T) {
                        return false;
                    }
                    A1P.A0z();
                    return false;
                }
                return false;
            }
        });
        C2Q5 c2q5 = this.A0F;
        if (c2q5 != null) {
            c2q5.A02 = new Handler(Looper.getMainLooper());
            AudioManager A0A = c2q5.A06.A0A();
            if (A0A != null && A0A.getRingerMode() != 2) {
                z = true;
            }
            c2q5.A05 = z;
            this.A07.setKeepScreenOn(true);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C2Q5 c2q5 = this.A0F;
        Handler handler = c2q5.A02;
        if (handler != null) {
            handler.removeCallbacks(c2q5.A07);
        }
        if (c2q5.A03 != null) {
            Log.i("AudioManager/audio-focus-abandoned");
            c2q5.A03 = null;
            AudioManager A0A = c2q5.A06.A0A();
            if (A0A != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    A0A.abandonAudioFocusRequest(c2q5.A01());
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c2q5.A01;
                    if (onAudioFocusChangeListener == null) {
                        onAudioFocusChangeListener = C71713Xe.A00;
                        c2q5.A01 = onAudioFocusChangeListener;
                    }
                    A0A.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        }
        if (c2q5.A04 != null) {
            c2q5.A04 = null;
        }
        C2EQ c2eq = this.A0C;
        C48242Em c48242Em = c2eq.A00;
        C48252En c48252En = c2eq.A01;
        if (c48242Em != null && c48252En != null) {
            ArrayList arrayList = new ArrayList();
            for (C48262Eo c48262Eo : c48252En.A0A.values()) {
                AnonymousClass011 anonymousClass011 = c2eq.A05;
                if (c48262Eo != null) {
                    C37521mY c37521mY = new C37521mY();
                    c37521mY.A05 = Long.valueOf(c48262Eo.A05);
                    c37521mY.A06 = Long.valueOf(c48262Eo.A06);
                    c37521mY.A01 = Integer.valueOf(c48262Eo.A02);
                    c37521mY.A02 = Long.valueOf(c48262Eo.A01);
                    c37521mY.A00 = Integer.valueOf(c48262Eo.A00);
                    c37521mY.A04 = Long.valueOf(c48262Eo.A04);
                    c37521mY.A03 = Long.valueOf(c48262Eo.A03);
                    anonymousClass011.A09(c37521mY, 1);
                    AnonymousClass011.A01(c37521mY, "");
                    arrayList.addAll(c48262Eo.A07.values());
                } else {
                    throw null;
                }
            }
            c2eq.A07.AS1(new RunnableEBaseShape4S0200000_I0_4(c2eq, arrayList, 13));
            c2eq.A01 = null;
        }
        C2Q4 c2q4 = this.A0G;
        C48652Gd c48652Gd = c2q4.A00;
        if (c48652Gd != null) {
            c48652Gd.A09();
            c2q4.A00 = null;
        }
    }
}
