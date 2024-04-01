package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape3S0100000_I0_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2Gl */
/* loaded from: classes2.dex */
public class C48732Gl extends AbstractC04890Mh {
    public boolean A00 = false;
    public Bitmap[] A01;
    public boolean[] A02;
    public boolean[] A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Drawable A07;
    public final C002301c A08;
    public final C44011yN A09;
    public final C48702Gi A0A;

    public C48732Gl(Context context, C44011yN c44011yN, C002301c c002301c, C48702Gi c48702Gi) {
        this.A06 = context;
        this.A09 = c44011yN;
        this.A08 = c002301c;
        this.A0A = c48702Gi;
        this.A04 = context.getResources().getDimension(R.dimen.filter_selected_thumb_height) / c48702Gi.A0J;
        this.A05 = context.getResources().getDimension(R.dimen.filter_selected_thumb_width) / c48702Gi.A0K;
        this.A07 = new ColorDrawable(C02160Ac.A00(context, R.color.camera_thumb));
        int size = C2JQ.A00.size() - 1;
        this.A01 = new Bitmap[size];
        this.A03 = new boolean[size];
        this.A02 = new boolean[size];
        A0G(0);
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return C2JQ.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new View$OnClickListenerC68053Hw(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.filter_thumb_item, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        float f;
        View$OnClickListenerC68053Hw view$OnClickListenerC68053Hw = (View$OnClickListenerC68053Hw) c0ts;
        C48702Gi c48702Gi = this.A0A;
        boolean booleanValue = Boolean.valueOf(i == c48702Gi.A02).booleanValue();
        if (booleanValue) {
            f = this.A05;
        } else {
            f = 1.0f;
        }
        float f2 = booleanValue ? this.A04 : 1.0f;
        view$OnClickListenerC68053Hw.A04.A03(booleanValue, false);
        View view = view$OnClickListenerC68053Hw.A00;
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setPivotX(c48702Gi.A0K / 2.0f);
        view.setPivotY(c48702Gi.A0J);
        Context context = this.A06;
        String string = context.getString(C2JQ.A00(i).A01);
        TextView textView = view$OnClickListenerC68053Hw.A03;
        textView.setText(string);
        ImageView imageView = view$OnClickListenerC68053Hw.A02;
        imageView.setBackground(this.A07);
        imageView.setImageDrawable(null);
        View view2 = view$OnClickListenerC68053Hw.A01;
        view2.setOnClickListener(view$OnClickListenerC68053Hw);
        if (c48702Gi.A03 != null) {
            if (i == 0) {
                new C0HS(context, c48702Gi, this, i, this.A01, this.A03, this.A02, view$OnClickListenerC68053Hw, this.A09) { // from class: X.3Hv
                    public int A00;
                    public C48702Gi A01;
                    public View$OnClickListenerC68053Hw A02;
                    public C48732Gl A03;
                    public WeakReference A04;
                    public Bitmap[] A05;
                    public boolean[] A06;
                    public boolean[] A07;
                    public final C44011yN A08;

                    {
                        this.A04 = new WeakReference(context);
                        this.A01 = c48702Gi;
                        this.A03 = this;
                        this.A00 = i;
                        this.A05 = r6;
                        this.A07 = r7;
                        this.A06 = r8;
                        this.A02 = view$OnClickListenerC68053Hw;
                        this.A08 = r10;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        Bitmap bitmap;
                        int i2 = this.A00;
                        int i3 = i2 - 1;
                        if (i2 == 0) {
                            return this.A01.A03;
                        }
                        if (this.A05[i3] != null) {
                            boolean[] zArr = this.A07;
                            if (zArr[i3]) {
                                zArr[i3] = !FilterUtils.A02(this.A01.A03, bitmap, i2, this.A08);
                            }
                            return this.A05[i3];
                        }
                        Bitmap A01 = FilterUtils.A01(this.A01.A03, i2, true, this.A08);
                        if (A01 != null) {
                            this.A05[i3] = A01;
                            this.A07[i3] = false;
                            return A01;
                        }
                        Log.e("FilterThumbnailAdapter/onBindViewHolder/onPostExecute/failed to create thumbnail");
                        return null;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
                        if (r4 == null) goto L12;
                     */
                    @Override // X.C0HS
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void A09(java.lang.Object r4) {
                        /*
                            r3 = this;
                            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
                            java.lang.ref.WeakReference r0 = r3.A04
                            java.lang.Object r1 = r0.get()
                            android.content.Context r1 = (android.content.Context) r1
                            r2 = 0
                            if (r1 == 0) goto L54
                            X.2Gi r0 = r3.A01
                            android.graphics.Bitmap r0 = r0.A03
                            if (r0 == 0) goto L54
                            if (r4 == 0) goto L56
                            boolean r0 = r4.isRecycled()
                            if (r0 != 0) goto L48
                            X.3Hw r0 = r3.A02
                            android.widget.ImageView r0 = r0.A02
                            r0.setBackgroundResource(r2)
                            X.3Hw r0 = r3.A02
                            android.widget.ImageView r2 = r0.A02
                            android.content.res.Resources r1 = r1.getResources()
                            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
                            r0.<init>(r1, r4)
                            r2.setImageDrawable(r0)
                            X.3Hw r0 = r3.A02
                            android.widget.TextView r1 = r0.A03
                            int r0 = r3.A00
                            X.2JR r0 = X.C2JQ.A00(r0)
                            int r0 = r0.A01
                            r1.setText(r0)
                            X.3Hw r1 = r3.A02
                            android.view.View r0 = r1.A01
                            r0.setOnClickListener(r1)
                        L48:
                            r0 = 0
                            r3.A01 = r0
                            r3.A03 = r0
                            r3.A02 = r0
                            r3.A07 = r0
                            r3.A05 = r0
                            return
                        L54:
                            if (r4 != 0) goto L48
                        L56:
                            int r0 = r3.A00
                            if (r0 == 0) goto L48
                            int r1 = r0 + (-1)
                            boolean[] r0 = r3.A06
                            r0[r1] = r2
                            X.2Gl r0 = r3.A03
                            if (r0 == 0) goto L48
                            r0.A02(r1)
                            goto L48
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C68043Hv.A09(java.lang.Object):void");
                    }
                }.A02.executeOnExecutor(c48702Gi.A0V, new Void[0]);
                return;
            }
            boolean[] zArr = this.A02;
            if (zArr[i - 1]) {
                new C0HS(context, c48702Gi, this, i, this.A01, this.A03, zArr, view$OnClickListenerC68053Hw, this.A09) { // from class: X.3Hv
                    public int A00;
                    public C48702Gi A01;
                    public View$OnClickListenerC68053Hw A02;
                    public C48732Gl A03;
                    public WeakReference A04;
                    public Bitmap[] A05;
                    public boolean[] A06;
                    public boolean[] A07;
                    public final C44011yN A08;

                    {
                        this.A04 = new WeakReference(context);
                        this.A01 = c48702Gi;
                        this.A03 = this;
                        this.A00 = i;
                        this.A05 = r6;
                        this.A07 = r7;
                        this.A06 = zArr;
                        this.A02 = view$OnClickListenerC68053Hw;
                        this.A08 = r10;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        Bitmap bitmap;
                        int i2 = this.A00;
                        int i3 = i2 - 1;
                        if (i2 == 0) {
                            return this.A01.A03;
                        }
                        if (this.A05[i3] != null) {
                            boolean[] zArr2 = this.A07;
                            if (zArr2[i3]) {
                                zArr2[i3] = !FilterUtils.A02(this.A01.A03, bitmap, i2, this.A08);
                            }
                            return this.A05[i3];
                        }
                        Bitmap A01 = FilterUtils.A01(this.A01.A03, i2, true, this.A08);
                        if (A01 != null) {
                            this.A05[i3] = A01;
                            this.A07[i3] = false;
                            return A01;
                        }
                        Log.e("FilterThumbnailAdapter/onBindViewHolder/onPostExecute/failed to create thumbnail");
                        return null;
                    }

                    @Override // X.C0HS
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void A09(java.lang.Object r4) {
                        /*
                            r3 = this;
                            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
                            java.lang.ref.WeakReference r0 = r3.A04
                            java.lang.Object r1 = r0.get()
                            android.content.Context r1 = (android.content.Context) r1
                            r2 = 0
                            if (r1 == 0) goto L54
                            X.2Gi r0 = r3.A01
                            android.graphics.Bitmap r0 = r0.A03
                            if (r0 == 0) goto L54
                            if (r4 == 0) goto L56
                            boolean r0 = r4.isRecycled()
                            if (r0 != 0) goto L48
                            X.3Hw r0 = r3.A02
                            android.widget.ImageView r0 = r0.A02
                            r0.setBackgroundResource(r2)
                            X.3Hw r0 = r3.A02
                            android.widget.ImageView r2 = r0.A02
                            android.content.res.Resources r1 = r1.getResources()
                            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
                            r0.<init>(r1, r4)
                            r2.setImageDrawable(r0)
                            X.3Hw r0 = r3.A02
                            android.widget.TextView r1 = r0.A03
                            int r0 = r3.A00
                            X.2JR r0 = X.C2JQ.A00(r0)
                            int r0 = r0.A01
                            r1.setText(r0)
                            X.3Hw r1 = r3.A02
                            android.view.View r0 = r1.A01
                            r0.setOnClickListener(r1)
                        L48:
                            r0 = 0
                            r3.A01 = r0
                            r3.A03 = r0
                            r3.A02 = r0
                            r3.A07 = r0
                            r3.A05 = r0
                            return
                        L54:
                            if (r4 != 0) goto L48
                        L56:
                            int r0 = r3.A00
                            if (r0 == 0) goto L48
                            int r1 = r0 + (-1)
                            boolean[] r0 = r3.A06
                            r0[r1] = r2
                            X.2Gl r0 = r3.A03
                            if (r0 == 0) goto L48
                            r0.A02(r1)
                            goto L48
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C68043Hv.A09(java.lang.Object):void");
                    }
                }.A02.executeOnExecutor(c48702Gi.A0V, new Void[0]);
            } else if (this.A00) {
                textView.setText(R.string.filter_loading);
                imageView.setBackgroundColor(C02160Ac.A00(context, R.color.filter_loading_background_color));
                view2.setOnClickListener(null);
                imageView.setClickable(false);
            } else {
                textView.setText(R.string.filter_error);
                imageView.setClickable(true);
                view2.setOnClickListener(new ViewOnClickEBaseShape3S0100000_I0_3(this, 7));
            }
        }
    }

    public void A0G(int i) {
        this.A00 = true;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.A02;
            if (i2 < zArr.length) {
                if (!zArr[i2]) {
                    A02(i2);
                }
                i2++;
            } else {
                C44011yN c44011yN = this.A09;
                C2HE c2he = new C2HE(this);
                synchronized (c44011yN) {
                    c44011yN.A0M(c2he, c44011yN.A0G(), i);
                }
                return;
            }
        }
    }
}
