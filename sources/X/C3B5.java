package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3B5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3B5 extends AbstractC04890Mh implements C1LE {
    public boolean A02;
    public final /* synthetic */ MediaGalleryFragmentBase A04;
    public int A00 = 10;
    public long A01 = 0;
    public final Map A03 = new HashMap();

    public C3B5(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        this.A04 = mediaGalleryFragmentBase;
        A0B(true);
    }

    @Override // X.AbstractC04890Mh
    public long A00(int i) {
        InterfaceC52142a8 interfaceC52142a8 = this.A04.A0E;
        InterfaceC52102a4 AB8 = interfaceC52142a8 != null ? interfaceC52142a8.AB8(i) : null;
        if (super.A00 && AB8 != null) {
            Uri A88 = AB8.A88();
            Map map = this.A03;
            Number number = (Number) map.get(A88);
            if (number == null) {
                long j = this.A01;
                this.A01 = 1 + j;
                number = Long.valueOf(j);
                map.put(A88, number);
            }
            return number.longValue();
        }
        return 0L;
    }

    @Override // X.AbstractC04890Mh
    public void A07(C0TS c0ts) {
        C51682Xk c51682Xk = ((C3B6) c0ts).A00;
        c51682Xk.setImageBitmap(null);
        c51682Xk.A00 = null;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A04.A00;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        C51682Xk c51682Xk;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        if (mediaGalleryFragmentBase instanceof StorageUsageMediaGalleryFragment) {
            c51682Xk = new C51662Xi(mediaGalleryFragmentBase.A09());
        } else if (mediaGalleryFragmentBase instanceof MediaPickerFragment) {
            c51682Xk = new C51702Xm(mediaGalleryFragmentBase.A09());
        } else if (!(mediaGalleryFragmentBase instanceof MediaGalleryFragment)) {
            c51682Xk = new C51702Xm(mediaGalleryFragmentBase.A09());
        } else {
            C51662Xi c51662Xi = new C51662Xi(mediaGalleryFragmentBase.A09());
            c51662Xi.A00 = 2;
            c51682Xk = c51662Xi;
        }
        return new C3B6(mediaGalleryFragmentBase, c51682Xk);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        final C3B6 c3b6 = (C3B6) c0ts;
        int i2 = this.A00;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        if (i2 < mediaGalleryFragmentBase.A08.getChildCount()) {
            int childCount = mediaGalleryFragmentBase.A08.getChildCount();
            this.A00 = childCount;
            C15210oG A00 = mediaGalleryFragmentBase.A08.getRecycledViewPool().A00(1);
            A00.A00 = childCount;
            ArrayList arrayList = A00.A03;
            while (arrayList.size() > childCount) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        final C51682Xk c51682Xk = (C51682Xk) c3b6.A0H;
        c51682Xk.A00 = null;
        c51682Xk.setScaleType(ImageView.ScaleType.CENTER_CROP);
        InterfaceC52142a8 interfaceC52142a8 = mediaGalleryFragmentBase.A0E;
        if (interfaceC52142a8 != null) {
            final InterfaceC52102a4 AB8 = interfaceC52142a8.AB8(i);
            c51682Xk.setMediaItem(AB8);
            if (c51682Xk instanceof C51662Xi) {
                ((C51662Xi) c51682Xk).A08 = mediaGalleryFragmentBase.A02 == 3;
            }
            if (c51682Xk.getTag() instanceof InterfaceC61152vg) {
                mediaGalleryFragmentBase.A0I.A01((InterfaceC61152vg) c51682Xk.getTag());
            }
            if (AB8 != null) {
                final InterfaceC61152vg interfaceC61152vg = new InterfaceC61152vg() { // from class: X.3B3
                    @Override // X.InterfaceC61152vg
                    public String ADR() {
                        return C43981yK.A06(AB8.A88());
                    }

                    @Override // X.InterfaceC61152vg
                    public Bitmap AG1() {
                        if (c51682Xk.getTag() != this || c3b6.A01() == -1) {
                            return null;
                        }
                        Bitmap AVV = AB8.AVV(C3B5.this.A04.A03);
                        return AVV == null ? MediaGalleryFragmentBase.A0Q : AVV;
                    }
                };
                c51682Xk.setTag(interfaceC61152vg);
                mediaGalleryFragmentBase.A0I.A02(interfaceC61152vg, new InterfaceC61162vh() { // from class: X.3B4
                    @Override // X.InterfaceC61162vh
                    public /* synthetic */ void AKC() {
                    }

                    @Override // X.InterfaceC61162vh
                    public void A5d() {
                        C51682Xk c51682Xk2 = c51682Xk;
                        c51682Xk2.setBackgroundColor(C3B5.this.A04.A01);
                        c51682Xk2.setImageDrawable(null);
                    }

                    @Override // X.InterfaceC61162vh
                    public void APF(Bitmap bitmap, boolean z) {
                        Bitmap bitmap2 = bitmap;
                        MediaGalleryFragmentBase mediaGalleryFragmentBase2 = C3B5.this.A04;
                        if (mediaGalleryFragmentBase2.A09() == null) {
                            return;
                        }
                        C51682Xk c51682Xk2 = c51682Xk;
                        if (c51682Xk2.getTag() == interfaceC61152vg) {
                            InterfaceC52102a4 interfaceC52102a4 = AB8;
                            if (bitmap == MediaGalleryFragmentBase.A0Q) {
                                bitmap2 = null;
                            }
                            C43981yK.A0D(c51682Xk2, interfaceC52102a4, bitmap2, mediaGalleryFragmentBase2.A01, mediaGalleryFragmentBase2.A04, !z);
                        }
                    }
                });
                c51682Xk.setChecked(mediaGalleryFragmentBase.A18(i));
            } else {
                c51682Xk.setScaleType(ImageView.ScaleType.CENTER);
                c51682Xk.setBackgroundColor(mediaGalleryFragmentBase.A01);
                c51682Xk.setImageDrawable(null);
                c51682Xk.setChecked(false);
            }
            if (this.A02) {
                return;
            }
            this.A02 = true;
            c51682Xk.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.2vJ
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    c51682Xk.getViewTreeObserver().removeOnPreDrawListener(this);
                    C3B5.this.A04.A09().A0T();
                    return true;
                }
            });
        }
    }

    public final void A0G(StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment, C3B0 c3b0, int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        if (mediaGalleryFragmentBase.A0L && mediaGalleryFragmentBase.A0E != null) {
            boolean isChecked = c3b0.A00.isChecked();
            int count = mediaGalleryFragmentBase.A0E.getCount() - 1;
            int i2 = mediaGalleryFragmentBase.A02;
            boolean z = true;
            if (i2 != 0 && i2 != 1) {
                z = false;
            }
            int i3 = 0;
            if (z) {
                int i4 = 0;
                while (i3 <= i) {
                    if (i3 == i) {
                        count = (((C52592az) mediaGalleryFragmentBase.A0P.get(i3)).count + i4) - 1;
                    } else {
                        i4 += ((C52592az) mediaGalleryFragmentBase.A0P.get(i3)).count;
                    }
                    i3++;
                }
                i3 = i4;
            }
            ArrayList arrayList = new ArrayList();
            while (i3 <= count) {
                InterfaceC52102a4 AB8 = mediaGalleryFragmentBase.A0E.AB8(i3);
                if (AB8 != null && (AB8 instanceof AbstractC53492h0)) {
                    arrayList.add(((AbstractC53492h0) AB8).A00);
                }
                i3++;
            }
            int size = arrayList.size();
            if (isChecked) {
                if (size != 0) {
                    if (!storageUsageMediaGalleryFragment.A17()) {
                        ((InterfaceC04690Ll) storageUsageMediaGalleryFragment.A0A()).AV2((AnonymousClass092) arrayList.get(0));
                    }
                    ((InterfaceC04690Ll) storageUsageMediaGalleryFragment.A0A()).ATr(arrayList, true);
                    ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
                }
            } else if (size != 0) {
                ((InterfaceC04690Ll) storageUsageMediaGalleryFragment.A0A()).ATr(arrayList, false);
                ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A06.A01.A00();
            }
        }
    }

    @Override // X.C1LE
    public int A9A(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        int i2 = mediaGalleryFragmentBase.A02;
        if (i2 != 0 && i2 != 1) {
            return mediaGalleryFragmentBase.A00;
        }
        return ((C52592az) mediaGalleryFragmentBase.A0P.get(i)).count;
    }

    @Override // X.C1LE
    public int AAR() {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        int i = mediaGalleryFragmentBase.A02;
        if (i == 0 || i == 1) {
            return mediaGalleryFragmentBase.A0P.size();
        }
        return 1;
    }

    @Override // X.C1LE
    public long AAS(int i) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        int i2 = mediaGalleryFragmentBase.A02;
        if (i2 != 0 && i2 != 1) {
            return 1L;
        }
        return -((Calendar) mediaGalleryFragmentBase.A0P.get(i)).getTimeInMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r0 == 1) goto L25;
     */
    @Override // X.C1LE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AHy(X.C0TS r9, int r10) {
        /*
            r8 = this;
            X.3B0 r9 = (X.C3B0) r9
            com.whatsapp.gallery.MediaGalleryFragmentBase r2 = r8.A04
            int r1 = r2.A02
            r3 = 1
            if (r1 == 0) goto L66
            if (r1 == r3) goto L66
            r0 = 2
            if (r1 != r0) goto L5a
            android.widget.TextView r1 = r9.A01
            r0 = 2131889847(0x7f120eb7, float:1.941437E38)
            r1.setText(r0)
        L16:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L8f
            android.widget.CheckBox r7 = r9.A00
            r6 = 0
            r7.setVisibility(r6)
            boolean r0 = r2.A0L
            r7.setEnabled(r0)
            X.2a8 r1 = r2.A0E
            if (r1 == 0) goto L82
            boolean r0 = r2.A0L
            if (r0 == 0) goto L82
            int r1 = r1.getCount()
            int r1 = r1 - r3
            int r0 = r2.A02
            if (r0 == 0) goto L39
            r5 = 0
            if (r0 != r3) goto L76
        L39:
            r4 = 0
            r5 = 0
        L3b:
            if (r4 > r10) goto L76
            if (r4 != r10) goto L4e
            java.util.ArrayList r0 = r2.A0P
            java.lang.Object r0 = r0.get(r4)
            X.2az r0 = (X.C52592az) r0
            int r1 = r0.count
            int r1 = r1 + r5
            int r1 = r1 - r3
        L4b:
            int r4 = r4 + 1
            goto L3b
        L4e:
            java.util.ArrayList r0 = r2.A0P
            java.lang.Object r0 = r0.get(r4)
            X.2az r0 = (X.C52592az) r0
            int r0 = r0.count
            int r5 = r5 + r0
            goto L4b
        L5a:
            r0 = 3
            if (r1 != r0) goto L16
            android.widget.TextView r1 = r9.A01
            r0 = 2131889881(0x7f120ed9, float:1.9414438E38)
            r1.setText(r0)
            goto L16
        L66:
            android.widget.TextView r1 = r9.A01
            java.util.ArrayList r0 = r2.A0P
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r0 = r0.toString()
            r1.setText(r0)
            goto L16
        L76:
            if (r5 > r1) goto L81
            boolean r0 = r2.A18(r5)
            if (r0 == 0) goto L82
            int r5 = r5 + 1
            goto L76
        L81:
            r6 = 1
        L82:
            r7.setChecked(r6)
            r1 = 3
            com.facebook.redex.ViewOnClickEBaseShape1S0201000_I1 r0 = new com.facebook.redex.ViewOnClickEBaseShape1S0201000_I1
            r0.<init>(r8, r10, r9, r1)
            r7.setOnClickListener(r0)
            return
        L8f:
            android.widget.CheckBox r1 = r9.A00
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r1 = r9.A0H
            r0 = 0
            r1.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3B5.AHy(X.0TS, int):void");
    }

    @Override // X.C1LE
    public C0TS AJ6(ViewGroup viewGroup) {
        C002301c c002301c = this.A04.A0D;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.media_gallery_section_row, viewGroup, false);
        C0AT.A0W(inflate, !c002301c.A0M());
        inflate.setClickable(false);
        return new C3B0(inflate);
    }

    @Override // X.C1LE
    public boolean AP9(C0TS c0ts, int i, MotionEvent motionEvent) {
        C3B0 c3b0 = (C3B0) c0ts;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A04;
        if (mediaGalleryFragmentBase.A0M) {
            float x = motionEvent.getX();
            CheckBox checkBox = c3b0.A00;
            if (x < checkBox.getX() || !mediaGalleryFragmentBase.A0L) {
                return false;
            }
            checkBox.setChecked(!checkBox.isChecked());
            A0G((StorageUsageMediaGalleryFragment) mediaGalleryFragmentBase, c3b0, i);
            return true;
        }
        return false;
    }
}
