package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.2GQ */
/* loaded from: classes2.dex */
public abstract class C2GQ extends C06020Rf {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewStub A04;
    public ImageView A05;
    public ProgressBar A06;
    public TextView A07;
    public TextView A08;
    public C06030Rg A09;
    public C06030Rg A0A;
    public WaImageView A0B;
    public C655037l A0C;
    public C06C A0D;
    public RunnableEBaseShape0S0400000_I0 A0E;
    public final ActivityC02320As A0G;
    public final C06040Rh A0H;
    public final C018508q A0I;
    public final C1M7 A0J;
    public final C06M A0L;
    public final C03320Ff A0N;
    public final C0L7 A0O;
    public final AnonymousClass008 A0Q;
    public final C018708s A0R;
    public final C0LF A0S;
    public final C002301c A0T;
    public final C0DK A0U;
    public final C40081rY A0V;
    public final C03360Fk A0X;
    public final AbstractC005302j A0Y;
    public final C2AR A0Z;
    public final InterfaceC002901k A0a;
    public boolean A0F = false;
    public final C0GA A0P = new C0GA() { // from class: X.37h
        {
            C2GQ.this = this;
        }

        @Override // X.C0GA
        public void A00() {
            C2GQ.this.A01();
        }

        @Override // X.C0GA
        public void A01(AbstractC005302j abstractC005302j) {
            C2GQ c2gq = C2GQ.this;
            if (C2GQ.A00(c2gq, abstractC005302j)) {
                ProgressBar progressBar = c2gq.A06;
                if (progressBar == null) {
                    progressBar = (ProgressBar) c2gq.A04.inflate();
                    c2gq.A06 = progressBar;
                }
                progressBar.setVisibility(8);
                c2gq.A05.setVisibility(0);
                c2gq.A01();
            }
        }

        @Override // X.C0GA
        public void A03(UserJid userJid) {
            C2GQ c2gq = C2GQ.this;
            if (C2GQ.A00(c2gq, userJid)) {
                c2gq.A01();
            }
        }

        @Override // X.C0GA
        public void A04(UserJid userJid) {
            C2GQ c2gq = C2GQ.this;
            if (C2GQ.A00(c2gq, userJid)) {
                c2gq.A02();
            }
        }
    };
    public final C0GC A0M = new C0GC() { // from class: X.37i
        {
            C2GQ.this = this;
        }

        @Override // X.C0GC
        public void A00(AbstractC005302j abstractC005302j) {
            C2GQ.this.A01();
        }

        @Override // X.C0GC
        public void A01(AbstractC005302j abstractC005302j) {
            C2GQ c2gq = C2GQ.this;
            if (C2GQ.A00(c2gq, abstractC005302j)) {
                c2gq.A02();
            }
        }
    };
    public final C0GE A0W = new C0GE() { // from class: X.37j
        {
            C2GQ.this = this;
        }

        @Override // X.C0GE
        public void A00(Set set) {
            C2GQ.this.A01();
        }
    };
    public final AbstractC09240cu A0K = new AbstractC09240cu() { // from class: X.37k
        {
            C2GQ.this = this;
        }

        @Override // X.AbstractC09240cu
        public void A01(UserJid userJid) {
            C2GQ c2gq = C2GQ.this;
            if (C2GQ.A00(c2gq, userJid)) {
                c2gq.A01();
            }
        }
    };

    public C2GQ(ActivityC02320As activityC02320As, C018508q c018508q, InterfaceC002901k interfaceC002901k, C40081rY c40081rY, C0L7 c0l7, C06040Rh c06040Rh, C018708s c018708s, C002301c c002301c, C1M7 c1m7, AnonymousClass008 anonymousClass008, C2AR c2ar, C03320Ff c03320Ff, C06M c06m, C0LF c0lf, C0DK c0dk, C03360Fk c03360Fk, AbstractC005302j abstractC005302j, C06C c06c) {
        this.A0G = activityC02320As;
        this.A0I = c018508q;
        this.A0a = interfaceC002901k;
        this.A0V = c40081rY;
        this.A0O = c0l7;
        this.A0H = c06040Rh;
        this.A0R = c018708s;
        this.A0T = c002301c;
        this.A0J = c1m7;
        this.A0Q = anonymousClass008;
        this.A0Z = c2ar;
        this.A0N = c03320Ff;
        this.A0L = c06m;
        this.A0S = c0lf;
        this.A0U = c0dk;
        this.A0X = c03360Fk;
        this.A0Y = abstractC005302j;
        this.A0D = c06c;
    }

    public static boolean A00(C2GQ c2gq, AbstractC005302j abstractC005302j) {
        if (c2gq != null) {
            return abstractC005302j != null && abstractC005302j.equals(c2gq.A0Y);
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0HS, X.37l] */
    public void A01() {
        C06C A02 = this.A0U.A02(this.A0Y);
        this.A0D = A02;
        this.A0A.A03(A02, null);
        C655037l c655037l = this.A0C;
        if (c655037l != null) {
            c655037l.A05(true);
        }
        ?? r2 = new C0HS(this.A0O, this.A0S, this.A0D, this.A05) { // from class: X.37l
            public final float A00;
            public final int A01;
            public final C0L7 A02;
            public final C0LF A03;
            public final C06C A04;
            public final WeakReference A05;

            {
                this.A02 = r3;
                this.A03 = r4;
                this.A04 = r5;
                this.A01 = r6.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_profile_photo_size);
                this.A00 = r6.getContext().getResources().getDimension(R.dimen.small_avatar_radius);
                this.A05 = new WeakReference(r6);
            }

            @Override // X.C0HS
            public Object A07(Object[] objArr) {
                View view = (View) this.A05.get();
                if (view != null) {
                    return this.A03.A02(view.getContext(), this.A04, this.A01, this.A00, false);
                }
                return null;
            }

            @Override // X.C0HS
            public void A09(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                ImageView imageView = (ImageView) this.A05.get();
                if (imageView != null) {
                    if (bitmap == null) {
                        C0L7 c0l7 = this.A02;
                        bitmap = c0l7.A00.A00(imageView.getContext(), c0l7.A03(this.A04));
                    }
                    imageView.setImageDrawable(new BitmapDrawable(imageView.getContext().getResources(), bitmap) { // from class: X.2r8
                        public final float A00;
                        public final Paint A01;

                        {
                            super(r3, bitmap);
                            this.A00 = r3.getDimension(R.dimen.small_avatar_radius);
                            Paint paint = new Paint();
                            this.A01 = paint;
                            paint.setAntiAlias(true);
                            this.A01.setStrokeJoin(Paint.Join.ROUND);
                            this.A01.setStrokeCap(Paint.Cap.ROUND);
                            this.A01.setStrokeWidth(r3.getDimension(R.dimen.conversation_title_contact_photo_stroke_width));
                        }

                        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
                        public void draw(Canvas canvas) {
                            super.draw(canvas);
                            RectF rectF = new RectF(getBounds());
                            Paint paint = this.A01;
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setColor(1493172224);
                            float f = this.A00;
                            if (f > 0.0f) {
                                canvas.drawRoundRect(rectF, f, f, paint);
                            } else {
                                canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
                            }
                        }
                    });
                    imageView.setVisibility(0);
                }
            }
        };
        this.A0C = r2;
        this.A0a.ARy(r2, new Void[0]);
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x003c, code lost:
        if (r12.A0F(r11.A0D) != false) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A02() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2GQ.A02():void");
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityC02320As activityC02320As = this.A0G;
        C0U1 A0c = activityC02320As.A0c();
        if (A0c != null) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(A0c.A02()).inflate(R.layout.conversation_actionbar, (ViewGroup) null, false);
            this.A02 = viewGroup;
            this.A03 = (ViewGroup) viewGroup.findViewById(R.id.conversation_contact);
            this.A0B = (WaImageView) C0AT.A0D(this.A02, R.id.ephemeral_status);
            ViewGroup viewGroup2 = this.A03;
            C018708s c018708s = this.A0R;
            C2AR c2ar = this.A0Z;
            this.A0A = new C06030Rg(viewGroup2, (int) R.id.conversation_contact_name, c018708s, c2ar);
            View findViewById = this.A03.findViewById(R.id.conversation_contact_status_holder);
            this.A01 = findViewById;
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new C2JB(this));
            this.A00 = this.A03.findViewById(R.id.business_holder);
            this.A08 = (TextView) this.A03.findViewById(R.id.conversation_contact_status);
            this.A09 = new C06030Rg(this.A01, (int) R.id.business_name, c018708s, c2ar);
            this.A07 = (TextView) this.A03.findViewById(R.id.business_separator);
            this.A05 = (ImageView) this.A02.findViewById(R.id.conversation_contact_photo);
            C002301c c002301c = this.A0T;
            if (c002301c.A0N() && Build.VERSION.SDK_INT < 19) {
                this.A03.setLayoutTransition(null);
            }
            this.A03.setClickable(true);
            View findViewById2 = this.A02.findViewById(R.id.back);
            if (Build.VERSION.SDK_INT > 21) {
                C0U1 A0c2 = activityC02320As.A0c();
                if (A0c2 != null) {
                    findViewById2.setBackground(new C0We(c002301c, C02160Ac.A03(A0c2.A02(), R.drawable.conversation_navigate_up_background)));
                    int dimensionPixelSize = activityC02320As.getResources().getDimensionPixelSize(R.dimen.conversation_navigation_up_padding);
                    C0LX.A06(c002301c, findViewById2, dimensionPixelSize, dimensionPixelSize);
                } else {
                    throw null;
                }
            }
            findViewById2.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(activity, 10));
            this.A04 = (ViewStub) this.A02.findViewById(R.id.change_photo_progress_stub);
            C0U1 A0c3 = activityC02320As.A0c();
            if (A0c3 != null) {
                A0c3.A0M(true);
                C0U1 A0c4 = activityC02320As.A0c();
                if (A0c4 != null) {
                    A0c4.A0D(this.A02);
                    this.A0Q.A01(this.A0P);
                    this.A0N.A01(this.A0M);
                    this.A0L.A01(this.A0K);
                    this.A0X.A01(this.A0W);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C655037l c655037l = this.A0C;
        if (c655037l != null) {
            c655037l.A05(true);
            this.A0C = null;
        }
        this.A0Q.A00(this.A0P);
        this.A0N.A00(this.A0M);
        this.A0L.A00(this.A0K);
        this.A0X.A00(this.A0W);
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        A01();
        this.A08.setSelected(true);
    }
}
