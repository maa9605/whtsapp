package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3Gs  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C67753Gs extends AbstractC04890Mh {
    public final int A00;
    public final Context A01;
    public final C06F A02;
    public final C002301c A03;
    public final C40081rY A04;
    public final C2Gx A05;
    public final C52132a7 A06;
    public final C48822Gw A07;
    public final C2HT A08;
    public final C67723Gp A09;
    public final C43791xz A0A;
    public final C41961un A0B;
    public final HashSet A0C;
    public final Set A0D;

    public C67753Gs(Context context, C002301c c002301c, C40081rY c40081rY, C43791xz c43791xz, C67723Gp c67723Gp, C2HT c2ht, C41961un c41961un, C52132a7 c52132a7, C2Gx c2Gx, HashSet hashSet, C06F c06f, C48822Gw c48822Gw, int i) {
        A0B(true);
        this.A01 = context;
        this.A03 = c002301c;
        this.A04 = c40081rY;
        this.A0A = c43791xz;
        this.A09 = c67723Gp;
        this.A08 = c2ht;
        this.A0B = c41961un;
        this.A06 = c52132a7;
        this.A05 = c2Gx;
        this.A0C = hashSet;
        this.A0D = new HashSet();
        this.A02 = c06f;
        this.A07 = c48822Gw;
        this.A00 = i;
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        return this.A07.A04().get(i).hashCode();
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A07.A04().size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C0TS(new C2Xu(this.A01, this.A08, this.A0C)) { // from class: X.3Gr
        };
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C67743Gr c67743Gr = (C67743Gr) c0ts;
        C52132a7 c52132a7 = this.A06;
        if (c52132a7 != null) {
            final C2Xu c2Xu = (C2Xu) c67743Gr.A0H;
            C48822Gw c48822Gw = this.A07;
            c2Xu.setSelected(c48822Gw.A01() == i);
            c52132a7.A01((InterfaceC61152vg) c2Xu.getTag());
            Uri uri = (Uri) c48822Gw.A04().get(i);
            C42611w2 A01 = this.A05.A01(uri);
            c2Xu.A02 = A01;
            c2Xu.A04 = c67743Gr;
            C41961un c41961un = this.A0B;
            byte A0Y = c41961un.A0Y(A01);
            A01.A0A(Byte.valueOf(A0Y));
            if (A0Y == 3) {
                Context context = this.A01;
                c2Xu.A01 = C02160Ac.A03(context, R.drawable.mark_video);
                c2Xu.setContentDescription(context.getString(R.string.conversations_most_recent_video));
            } else if (A0Y != 13) {
                c2Xu.A01 = null;
                c2Xu.setContentDescription(this.A01.getString(R.string.conversations_most_recent_image));
            } else {
                Context context2 = this.A01;
                c2Xu.A01 = C02160Ac.A03(context2, R.drawable.mark_gif);
                c2Xu.setContentDescription(context2.getString(R.string.conversations_most_recent_gif));
            }
            c2Xu.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, i, 1));
            c2Xu.setOnTouchListener(new View.OnTouchListener() { // from class: X.2zg
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
                    if (r1 != 3) goto L11;
                 */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
                    /*
                        Method dump skipped, instructions count: 325
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.View$OnTouchListenerC63372zg.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
            final C67763Gt c67763Gt = new C67763Gt(this.A03, this.A04, c41961un, this.A0A, uri, A01, c2Xu, this.A00);
            this.A0D.add(c67763Gt);
            c2Xu.setTag(c67763Gt);
            final C06F c06f = this.A02;
            InterfaceC61162vh interfaceC61162vh = new InterfaceC61162vh(c67763Gt, c2Xu, c06f) { // from class: X.3Gu
                public Context A00;
                public C2Xu A01;
                public final int A02;
                public final Drawable A03;
                public final C06F A04;
                public final C67763Gt A05;

                @Override // X.InterfaceC61162vh
                public /* synthetic */ void AKC() {
                }

                {
                    Context context3 = c2Xu.getContext();
                    this.A00 = context3;
                    this.A05 = c67763Gt;
                    this.A01 = c2Xu;
                    this.A04 = c06f;
                    int A00 = C02160Ac.A00(context3, R.color.camera_thumb);
                    this.A02 = A00;
                    this.A03 = new ColorDrawable(A00);
                }

                @Override // X.InterfaceC61162vh
                public void A5d() {
                    this.A01.setBackgroundColor(this.A02);
                    this.A01.setImageDrawable(null);
                }

                @Override // X.InterfaceC61162vh
                public void APF(Bitmap bitmap, boolean z) {
                    Object tag = this.A01.getTag();
                    C67763Gt c67763Gt2 = this.A05;
                    if (tag == c67763Gt2) {
                        if (bitmap == MediaGalleryFragmentBase.A0Q) {
                            this.A01.setScaleType(ImageView.ScaleType.CENTER);
                            this.A01.setBackgroundColor(this.A02);
                            this.A01.setImageResource(R.drawable.ic_missing_thumbnail_picture);
                        } else {
                            this.A01.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            this.A01.setBackgroundResource(0);
                            if (!z) {
                                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.A03, new BitmapDrawable(this.A00.getResources(), bitmap)});
                                transitionDrawable.setCrossFadeEnabled(true);
                                transitionDrawable.startTransition(150);
                                this.A01.setImageDrawable(transitionDrawable);
                            } else {
                                this.A01.setImageBitmap(bitmap);
                            }
                        }
                        this.A04.A08(c67763Gt2.ADR(), bitmap);
                    }
                }
            };
            Bitmap bitmap = (Bitmap) c06f.A04(c67763Gt.ADR());
            if (bitmap == null) {
                c52132a7.A02(c67763Gt, interfaceC61162vh);
            } else {
                interfaceC61162vh.APF(bitmap, true);
            }
        }
    }
}
