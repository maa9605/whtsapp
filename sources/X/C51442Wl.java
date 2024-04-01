package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.location.WaMapView;
import com.whatsapp.util.ViewOnClickCListenerShape3S0200000_I0;
import com.whatsapp.util.ViewOnClickCListenerShape9S0100000_I0_1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2Wl */
/* loaded from: classes2.dex */
public class C51442Wl extends AbstractC51452Wm {
    public static final Set A0F;
    public C03230Ew A00;
    public C58932rw A01;
    public C0WZ A02;
    public C42471vn A03;
    public boolean A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final ImageView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextEmojiLabel A0D;
    public final WaMapView A0E;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("www.facebook.com");
        hashSet.add("maps.google.com");
        hashSet.add("foursquare.com");
        A0F = Collections.unmodifiableSet(hashSet);
    }

    public C51442Wl(Context context, C0LP c0lp) {
        super(context, c0lp);
        this.A09 = (ImageView) findViewById(R.id.thumb);
        this.A08 = findViewById(R.id.thumb_button);
        this.A0A = (TextView) findViewById(R.id.control_btn);
        this.A05 = findViewById(R.id.control_frame);
        this.A07 = findViewById(R.id.progress_bar);
        this.A0E = (WaMapView) findViewById(R.id.map_holder);
        this.A0D = (TextEmojiLabel) findViewById(R.id.place_name);
        this.A0C = (TextView) findViewById(R.id.place_address);
        this.A0B = (TextView) findViewById(R.id.host_view);
        this.A06 = findViewById(R.id.message_info_holder);
        TextEmojiLabel textEmojiLabel = this.A0D;
        if (textEmojiLabel != null) {
            C000200d.A0b(textEmojiLabel);
            this.A0D.setAutoLinkMask(0);
            this.A0D.setLinksClickable(false);
            this.A0D.setFocusable(false);
            this.A0D.setClickable(false);
            this.A0D.setLongClickable(false);
        }
        A0j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0011, code lost:
        if (r1.A02 == 2) goto L8;
     */
    @Override // X.AbstractC48202Eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07() {
        /*
            r4 = this;
            X.092 r1 = super.getFMessage()
            X.0KD r1 = (X.C0KD) r1
            X.094 r0 = r1.A0n
            boolean r0 = r0.A02
            r3 = 1
            if (r0 == 0) goto L13
            int r2 = r1.A02
            r1 = 2
            r0 = 1
            if (r2 != r1) goto L14
        L13:
            r0 = 0
        L14:
            r0 = r0 ^ r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51442Wl.A07():boolean");
    }

    @Override // X.AbstractC48202Eh
    public boolean A08() {
        return C0DB.A0g(super.getFMessage());
    }

    @Override // X.AbstractC48182Ef
    public void A0I() {
        A0j();
        A0e(false);
    }

    @Override // X.AbstractC48182Ef
    public void A0X(AnonymousClass092 anonymousClass092, boolean z) {
        boolean z2 = anonymousClass092 != super.getFMessage();
        super.A0X(anonymousClass092, z);
        if (z || z2) {
            A0j();
        }
    }

    public final void A0j() {
        TextView textView;
        C0LP c0lp = (C0LP) super.getFMessage();
        if (((C0KD) c0lp).A01 != 0.0d || ((C0KD) c0lp).A00 != 0.0d) {
            View view = this.A08;
            view.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(c0lp, this, 7));
            view.setOnLongClickListener(this.A19);
        }
        WaMapView waMapView = this.A0E;
        C41471ty c41471ty = ((AbstractC48202Eh) this).A0K;
        if (c41471ty == null) {
            throw null;
        }
        if (waMapView != null) {
            LatLng latLng = new LatLng(((C0KD) c0lp).A00, ((C0KD) c0lp).A01);
            waMapView.A01(c41471ty, latLng, null);
            waMapView.A00(latLng);
            View view2 = this.A05;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            View view3 = this.A06;
            if (view3 != null) {
                String str = c0lp.A01;
                CharSequence charSequence = c0lp.A00;
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(charSequence)) {
                    this.A0D.setVisibility(8);
                    this.A0C.setVisibility(8);
                    this.A0B.setVisibility(8);
                } else {
                    final String A1C = c0lp.A1C();
                    if (!TextUtils.isEmpty(str)) {
                        TextEmojiLabel textEmojiLabel = this.A0D;
                        textEmojiLabel.setVisibility(0);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                        C02740Cr c02740Cr = new C02740Cr(getContext(), ((AbstractC48182Ef) this).A0G, ((AbstractC48182Ef) this).A0W, this.A00, A1C);
                        if (str != null) {
                            spannableStringBuilder.setSpan(c02740Cr, 0, str.length(), 18);
                            textEmojiLabel.setText(A0G(spannableStringBuilder), TextView.BufferType.SPANNABLE);
                        } else {
                            throw null;
                        }
                    } else {
                        this.A0D.setVisibility(8);
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        textView = this.A0C;
                        textView.setText(A0G(charSequence));
                        textView.setVisibility(0);
                    } else {
                        textView = this.A0C;
                        textView.setVisibility(8);
                    }
                    textView.setOnClickListener(new AbstractView$OnClickListenerC49532Ky() { // from class: X.38Y
                        {
                            C51442Wl.this = this;
                        }

                        @Override // X.AbstractView$OnClickListenerC49532Ky
                        public void A00(View view4) {
                            String str2 = A1C;
                            Uri parse = Uri.parse(str2);
                            if (parse.getScheme() == null) {
                                StringBuilder A0P = C000200d.A0P("http://");
                                A0P.append(str2);
                                parse = Uri.parse(A0P.toString());
                            }
                            try {
                                C51442Wl.this.getContext().startActivity(new Intent("android.intent.action.VIEW", parse));
                            } catch (ActivityNotFoundException unused) {
                                ((AbstractC48182Ef) C51442Wl.this).A0G.A07(R.string.activity_not_found, 0);
                            }
                        }
                    });
                    String host = Uri.parse(A1C).getHost();
                    if (!TextUtils.isEmpty(host) && !A0F.contains(host)) {
                        TextView textView2 = this.A0B;
                        textView2.setText(host);
                        textView2.setVisibility(0);
                    } else {
                        this.A0B.setVisibility(8);
                    }
                }
                view3.setVisibility(0);
            }
            TextView textView3 = this.A0A;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            if (((C0KD) c0lp).A02 == 1) {
                View view4 = this.A07;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                if (c0lp.A0n.A02) {
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    this.A08.setOnClickListener(null);
                }
            } else {
                C0KD c0kd = (C0KD) super.getFMessage();
                if (c0kd.A0n.A02 && c0kd.A02 != 2) {
                    View view5 = this.A07;
                    if (view5 != null) {
                        view5.setVisibility(8);
                    }
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                        textView3.setText(R.string.retry);
                        textView3.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this));
                    }
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    this.A08.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_1(this));
                } else {
                    View view6 = this.A07;
                    if (view6 != null) {
                        view6.setVisibility(8);
                    }
                }
            }
            InterfaceC43821y3 interfaceC43821y3 = new InterfaceC43821y3() { // from class: X.38X
                @Override // X.InterfaceC43821y3
                public void AKM() {
                }

                {
                    C51442Wl.this = this;
                }

                @Override // X.InterfaceC43821y3
                public int ADA() {
                    return C51442Wl.this.getResources().getDimensionPixelSize(R.dimen.conversation_row_message_thumb_size);
                }

                @Override // X.InterfaceC43821y3
                public void AUc(View view7, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                    ImageView imageView = C51442Wl.this.A09;
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    } else {
                        imageView.setImageResource(R.drawable.media_location);
                    }
                }

                @Override // X.InterfaceC43821y3
                public void AUo(View view7) {
                    ImageView imageView = C51442Wl.this.A09;
                    imageView.setImageDrawable(null);
                    imageView.setBackgroundColor(-7829368);
                }
            };
            if (waMapView.getVisibility() == 0) {
                C42471vn c42471vn = this.A03;
                if (c42471vn != null) {
                    c42471vn.A0C(c0lp, this.A09, interfaceC43821y3, false);
                } else {
                    throw null;
                }
            } else {
                C42471vn c42471vn2 = this.A03;
                if (c42471vn2 != null) {
                    c42471vn2.A09(c0lp, this.A09, interfaceC43821y3, c0lp.A0n);
                } else {
                    throw null;
                }
            }
            if (c0lp.A0H != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.web_page_preview_holder);
                if (viewGroup != null) {
                    C3TK A00 = C3TK.A00(c0lp);
                    viewGroup.setVisibility(0);
                    if (this.A01 == null) {
                        C58932rw c58932rw = new C58932rw(getContext(), this.A00, this.A02, this.A03, A0F());
                        this.A01 = c58932rw;
                        viewGroup.addView(c58932rw.A0A, -1, -2);
                        this.A01.A0A.setOnLongClickListener(this.A19);
                    }
                    boolean A0i = A0i(A00.A03);
                    this.A04 = A0i;
                    this.A01.A01(c0lp, A0i, this, A00);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.web_page_preview_holder);
            if (viewGroup2 == null) {
                return;
            }
            C58932rw c58932rw2 = this.A01;
            if (c58932rw2 != null) {
                viewGroup2.removeView(c58932rw2.A0A);
                this.A01 = null;
            }
            viewGroup2.setVisibility(8);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC48202Eh
    public int getCenteredLayoutId() {
        return getIncomingLayoutId();
    }

    @Override // X.AbstractC48202Eh
    public /* bridge */ /* synthetic */ AnonymousClass092 getFMessage() {
        return super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public C0LP getFMessage() {
        return (C0LP) super.getFMessage();
    }

    @Override // X.AbstractC48202Eh
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_location_left_large;
    }

    @Override // X.AbstractC48202Eh
    public int getMainChildMaxWidth() {
        if (this.A04) {
            return (C2JE.A01(getContext()) * 72) / 100;
        }
        return super.getMainChildMaxWidth();
    }

    @Override // X.AbstractC48202Eh
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_location_right_large;
    }

    @Override // X.AbstractC48202Eh
    public void setFMessage(AnonymousClass092 anonymousClass092) {
        C000700j.A07(anonymousClass092 instanceof C0KD);
        super.setFMessage(anonymousClass092);
    }
}
