package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.util.List;

/* renamed from: X.2a5 */
/* loaded from: classes2.dex */
public class C52112a5 extends AbstractC04890Mh {
    public InterfaceC52142a8 A00;
    public final int A01;
    public final Drawable A02;
    public final /* synthetic */ C29X A03;

    public C52112a5(C29X c29x) {
        this.A03 = c29x;
        int A00 = C02160Ac.A00(c29x.A0L, R.color.camera_thumb);
        this.A01 = A00;
        this.A02 = new ColorDrawable(A00);
        A0B(true);
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        InterfaceC52102a4 A0G;
        if (this.A00 == null || (A0G = A0G(i)) == null) {
            return 0L;
        }
        return C43981yK.A06(A0G.A88()).hashCode();
    }

    @Override // X.AbstractC04890Mh
    public void A07(C0TS c0ts) {
        C51702Xm c51702Xm = ((AnonymousClass354) c0ts).A00;
        c51702Xm.setImageDrawable(null);
        ((C51682Xk) c51702Xm).A00 = null;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        InterfaceC52142a8 interfaceC52142a8 = this.A00;
        int count = interfaceC52142a8 == null ? 0 : interfaceC52142a8.getCount();
        C29X c29x = this.A03;
        return count + (c29x.A0f ? c29x.A1O.size() : 0);
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        C51702Xm c51702Xm = new C51702Xm(this.A03.A0L) { // from class: X.3Lx
            @Override // X.C51682Xk, android.widget.ImageView, android.view.View
            public void onMeasure(int i2, int i3) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.camera_thumb_size);
                setMeasuredDimension(dimensionPixelSize, dimensionPixelSize);
            }
        };
        if (Build.VERSION.SDK_INT >= 21) {
            c51702Xm.setSelector(null);
        }
        return new AnonymousClass354(this, c51702Xm);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        final InterfaceC52102a4 A0G = A0G(i);
        final C51702Xm c51702Xm = ((AnonymousClass354) c0ts).A00;
        c51702Xm.setMediaItem(A0G);
        ((C51682Xk) c51702Xm).A00 = null;
        c51702Xm.setId(R.id.thumb);
        C29X c29x = this.A03;
        c29x.A0U.A01((InterfaceC61152vg) c51702Xm.getTag());
        if (A0G != null) {
            c51702Xm.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C0AT.A0e(c51702Xm, A0G.A88().toString());
            final InterfaceC61152vg interfaceC61152vg = new InterfaceC61152vg() { // from class: X.352
                {
                    C52112a5.this = this;
                }

                @Override // X.InterfaceC61152vg
                public String ADR() {
                    return C43981yK.A06(A0G.A88());
                }

                @Override // X.InterfaceC61152vg
                public Bitmap AG1() {
                    if (c51702Xm.getTag() != this) {
                        return null;
                    }
                    Bitmap AVV = A0G.AVV(C52112a5.this.A03.A0L.getResources().getDimensionPixelSize(R.dimen.camera_thumb_size));
                    return AVV == null ? MediaGalleryFragmentBase.A0Q : AVV;
                }
            };
            c51702Xm.setTag(interfaceC61152vg);
            c29x.A0U.A02(interfaceC61152vg, new InterfaceC61162vh() { // from class: X.353
                @Override // X.InterfaceC61162vh
                public /* synthetic */ void AKC() {
                }

                {
                    C52112a5.this = this;
                }

                @Override // X.InterfaceC61162vh
                public void A5d() {
                    C51702Xm c51702Xm2 = c51702Xm;
                    c51702Xm2.setBackgroundColor(C52112a5.this.A01);
                    c51702Xm2.setImageDrawable(null);
                }

                @Override // X.InterfaceC61162vh
                public void APF(Bitmap bitmap, boolean z) {
                    C51702Xm c51702Xm2 = c51702Xm;
                    if (c51702Xm2.getTag() == interfaceC61152vg) {
                        if (bitmap == MediaGalleryFragmentBase.A0Q) {
                            c51702Xm2.setScaleType(ImageView.ScaleType.CENTER);
                            InterfaceC52102a4 interfaceC52102a4 = A0G;
                            int type = interfaceC52102a4.getType();
                            if (type == 0) {
                                c51702Xm2.setBackgroundColor(C52112a5.this.A01);
                                c51702Xm2.setImageResource(R.drawable.ic_missing_thumbnail_picture);
                                return;
                            } else if (type == 1 || type == 2) {
                                c51702Xm2.setBackgroundColor(C52112a5.this.A01);
                                c51702Xm2.setImageResource(R.drawable.ic_missing_thumbnail_video);
                                return;
                            } else if (type == 3) {
                                c51702Xm2.setBackgroundColor(C02160Ac.A00(C52112a5.this.A03.A0L, R.color.music_scrubber));
                                c51702Xm2.setImageResource(R.drawable.gallery_audio_item);
                                return;
                            } else if (type != 4) {
                                c51702Xm2.setBackgroundColor(C52112a5.this.A01);
                                c51702Xm2.setImageResource(0);
                                return;
                            } else {
                                C52112a5 c52112a5 = C52112a5.this;
                                c51702Xm2.setBackgroundColor(c52112a5.A01);
                                c51702Xm2.setImageDrawable(C460324r.A05(c52112a5.A03.A0L, interfaceC52102a4.ABN(), null, false));
                                return;
                            }
                        }
                        c51702Xm2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        c51702Xm2.setBackgroundResource(0);
                        ((C51682Xk) c51702Xm2).A00 = bitmap;
                        if (!z) {
                            C52112a5 c52112a52 = C52112a5.this;
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{c52112a52.A02, new BitmapDrawable(c52112a52.A03.A0L.getResources(), bitmap)});
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(150);
                            c51702Xm2.setImageDrawable(transitionDrawable);
                            return;
                        }
                        c51702Xm2.setImageBitmap(bitmap);
                    }
                }
            });
            c51702Xm.setChecked(c29x.A1P.contains(c51702Xm.getUri()));
            return;
        }
        c51702Xm.setScaleType(ImageView.ScaleType.CENTER);
        C0AT.A0e(c51702Xm, null);
        c51702Xm.setBackgroundColor(this.A01);
        c51702Xm.setImageDrawable(null);
        c51702Xm.setChecked(false);
    }

    public final InterfaceC52102a4 A0G(int i) {
        C29X c29x = this.A03;
        if (c29x.A0f) {
            List list = c29x.A1O;
            if (i < list.size()) {
                return (InterfaceC52102a4) list.get(i);
            }
            return this.A00.AB8(i - list.size());
        }
        return this.A00.AB8(i);
    }
}
