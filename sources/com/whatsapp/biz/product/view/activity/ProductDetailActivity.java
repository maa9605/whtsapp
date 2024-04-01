package com.whatsapp.biz.product.view.activity;

import X.AbstractC09240cu;
import X.AbstractC50472Rx;
import X.AnonymousClass011;
import X.AnonymousClass024;
import X.AnonymousClass075;
import X.AnonymousClass088;
import X.AnonymousClass272;
import X.C000200d;
import X.C018108l;
import X.C018708s;
import X.C02590Ca;
import X.C02L;
import X.C04160Iu;
import X.C04260Jm;
import X.C04P;
import X.C05W;
import X.C05Y;
import X.C06960Vv;
import X.C06C;
import X.C06M;
import X.C0L5;
import X.C2L3;
import X.C2N4;
import X.C2N8;
import X.C2N9;
import X.C33K;
import X.C34S;
import X.C36711lF;
import X.C42471vn;
import X.C464826z;
import X.C468628o;
import X.C49452Kn;
import X.C49462Ko;
import X.C50482Ry;
import X.C60042tp;
import X.InterfaceC05620Pl;
import X.InterfaceC43821y3;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.InfoCard;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.biz.catalog.CatalogReportDialogFragment;
import com.whatsapp.biz.catalog.ShareProductLinkActivity;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape8S0100000_I0_0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class ProductDetailActivity extends C2N8 implements C2N9 {
    public C02L A00;
    public C06M A01;
    public C49462Ko A02;
    public C2L3 A03;
    public C06960Vv A04;
    public C464826z A05;
    public C05W A06;
    public AnonymousClass075 A07;
    public C018708s A08;
    public C0L5 A09;
    public final AbstractC50472Rx A0B = new C50482Ry(this);
    public final AbstractC09240cu A0A = new AbstractC09240cu() { // from class: X.34Q
        {
            ProductDetailActivity.this = this;
        }

        @Override // X.AbstractC09240cu
        public void A01(UserJid userJid) {
            C68193Il c68193Il;
            ProductDetailActivity productDetailActivity = ProductDetailActivity.this;
            if (!productDetailActivity.A0Z.equals(userJid) || (c68193Il = ((C2N4) productDetailActivity).A0I) == null) {
                return;
            }
            c68193Il.A03();
        }
    };

    public static void A01(final C04160Iu c04160Iu, final View view, boolean z, final Context context, final AnonymousClass272 anonymousClass272, final C42471vn c42471vn, final boolean z2, final int i) {
        String str = c04160Iu.A04;
        UserJid userJid = c04160Iu.A01;
        C468628o A06 = anonymousClass272.A06(str);
        if (A06 != null) {
            C2N4.A00(userJid, A06.A09, z2, null, null, context, new Intent(context, ProductDetailActivity.class), i);
        } else if (z) {
            InterfaceC43821y3 interfaceC43821y3 = new InterfaceC43821y3() { // from class: X.34P
                public boolean A00 = false;

                @Override // X.InterfaceC43821y3
                public void AKM() {
                }

                @Override // X.InterfaceC43821y3
                public void AUo(View view2) {
                }

                @Override // X.InterfaceC43821y3
                public int ADA() {
                    return c42471vn.A03(view.getContext());
                }

                @Override // X.InterfaceC43821y3
                public void AUc(View view2, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                    C2N3 c2n3;
                    Bitmap bitmap2 = bitmap;
                    if (!this.A00) {
                        this.A00 = true;
                        bitmap2 = (bitmap == null || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) ? null : null;
                        C04160Iu c04160Iu2 = c04160Iu;
                        Context context2 = context;
                        String str2 = c04160Iu2.A04;
                        Conversation conversation = (Conversation) C02180Ae.A0G(context2, Conversation.class);
                        if (conversation != null) {
                            c2n3 = conversation.A1c();
                            if (c2n3 != null && bitmap2 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append('_');
                                sb.append(3);
                                String obj = sb.toString();
                                C2MT c2mt = c2n3.A01;
                                if (c2mt.A02 != null) {
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        bitmap2.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                        C66923Cy c66923Cy = c2mt.A02;
                                        if (c66923Cy != null) {
                                            String A01 = C02A.A01(obj);
                                            if (A01 != null) {
                                                ((AbstractC55962mT) c66923Cy).A03.A02(A01, byteArrayInputStream);
                                                byteArrayInputStream.close();
                                            } else {
                                                throw null;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                        } else {
                            c2n3 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < c04160Iu2.A00; i2++) {
                            if (i2 == 0 && c2n3 != null && bitmap2 != null) {
                                arrayList.add(new C2A2(str2, "", "", bitmap2.getWidth(), bitmap2.getHeight()));
                            } else {
                                arrayList.add(null);
                            }
                        }
                        String str3 = c04160Iu2.A07;
                        String str4 = str3 != null ? str3 : "";
                        String str5 = c04160Iu2.A03;
                        C468628o c468628o = new C468628o(str2, str4, str5 != null ? str5 : "", c04160Iu2.A08, TextUtils.isEmpty(c04160Iu2.A02) ? null : new C09R(c04160Iu2.A02), c04160Iu2.A05, c04160Iu2.A06, arrayList, new C468728p(0), null, null, 0, false, false);
                        anonymousClass272.A09(c468628o, null);
                        C2N4.A00(c04160Iu2.A01, c468628o.A09, z2, null, null, context2, new Intent(context2, ProductDetailActivity.class), i);
                    }
                }
            };
            if (c42471vn != null) {
                c42471vn.A09(c04160Iu, view, interfaceC43821y3, c04160Iu.A0n);
                return;
            }
            throw null;
        } else {
            c42471vn.A0C(c04160Iu, view, new InterfaceC43821y3() { // from class: X.34P
                public boolean A00 = false;

                @Override // X.InterfaceC43821y3
                public void AKM() {
                }

                @Override // X.InterfaceC43821y3
                public void AUo(View view2) {
                }

                @Override // X.InterfaceC43821y3
                public int ADA() {
                    return c42471vn.A03(view.getContext());
                }

                @Override // X.InterfaceC43821y3
                public void AUc(View view2, Bitmap bitmap, AnonymousClass092 anonymousClass092) {
                    C2N3 c2n3;
                    Bitmap bitmap2 = bitmap;
                    if (!this.A00) {
                        this.A00 = true;
                        bitmap2 = (bitmap == null || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) ? null : null;
                        C04160Iu c04160Iu2 = c04160Iu;
                        Context context2 = context;
                        String str2 = c04160Iu2.A04;
                        Conversation conversation = (Conversation) C02180Ae.A0G(context2, Conversation.class);
                        if (conversation != null) {
                            c2n3 = conversation.A1c();
                            if (c2n3 != null && bitmap2 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append('_');
                                sb.append(3);
                                String obj = sb.toString();
                                C2MT c2mt = c2n3.A01;
                                if (c2mt.A02 != null) {
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        bitmap2.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                        C66923Cy c66923Cy = c2mt.A02;
                                        if (c66923Cy != null) {
                                            String A01 = C02A.A01(obj);
                                            if (A01 != null) {
                                                ((AbstractC55962mT) c66923Cy).A03.A02(A01, byteArrayInputStream);
                                                byteArrayInputStream.close();
                                            } else {
                                                throw null;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                        } else {
                            c2n3 = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < c04160Iu2.A00; i2++) {
                            if (i2 == 0 && c2n3 != null && bitmap2 != null) {
                                arrayList.add(new C2A2(str2, "", "", bitmap2.getWidth(), bitmap2.getHeight()));
                            } else {
                                arrayList.add(null);
                            }
                        }
                        String str3 = c04160Iu2.A07;
                        String str4 = str3 != null ? str3 : "";
                        String str5 = c04160Iu2.A03;
                        C468628o c468628o = new C468628o(str2, str4, str5 != null ? str5 : "", c04160Iu2.A08, TextUtils.isEmpty(c04160Iu2.A02) ? null : new C09R(c04160Iu2.A02), c04160Iu2.A05, c04160Iu2.A06, arrayList, new C468728p(0), null, null, 0, false, false);
                        anonymousClass272.A09(c468628o, null);
                        C2N4.A00(c04160Iu2.A01, c468628o.A09, z2, null, null, context2, new Intent(context2, ProductDetailActivity.class), i);
                    }
                }
            }, false);
        }
    }

    public void A1R(int i) {
        ((C2N4) this).A0D.setVisibility(0);
        ((C2N4) this).A0D.setTextColor(getResources().getColor(R.color.catalog_error_color));
        ((C2N4) this).A0D.setText(i);
    }

    public void A1S(String str) {
        int i;
        C468628o c468628o = this.A0Y;
        if (c468628o != null) {
            C49462Ko c49462Ko = this.A02;
            String str2 = c468628o.A09;
            UserJid userJid = this.A0Z;
            boolean A01 = c49462Ko.A04.A01(c49462Ko.A00);
            if (c49462Ko.A05.contains(13) || A01) {
                C36711lF c36711lF = new C36711lF();
                c36711lF.A05 = 13;
                c36711lF.A09 = str;
                c36711lF.A0A = c49462Ko.A00;
                c36711lF.A0C = str2;
                c36711lF.A08 = userJid.getRawString();
                if (!A01) {
                    c36711lF.A01 = Boolean.TRUE;
                }
                c36711lF.A03 = Integer.valueOf(AnonymousClass088.A09(c49462Ko.A02.A04.A0E(userJid)));
                int andSet = c49462Ko.A07.getAndSet(0);
                if (andSet != 0) {
                    c36711lF.A04 = Integer.valueOf(andSet);
                }
                c36711lF.A0C = null;
                c36711lF.A08 = null;
                c36711lF.A0B = null;
                AnonymousClass011 anonymousClass011 = c49462Ko.A03;
                if (A01) {
                    i = c49462Ko.A04.A02;
                } else {
                    i = 1;
                }
                anonymousClass011.A08(c36711lF, i);
            }
            C60042tp c60042tp = new C60042tp(this.A0Y.A09, str, this.A02.A00, this.A0Z.getRawString());
            C2L3 c2l3 = this.A03;
            C33K c33k = new C33K(c2l3.A0D, c2l3, c60042tp);
            C05Y c05y = c33k.A02;
            String A02 = c05y.A02();
            C60042tp c60042tp2 = c33k.A01;
            ArrayList arrayList = new ArrayList();
            String str3 = c60042tp2.A01;
            arrayList.add(new C02590Ca("id", (C04P[]) null, str3));
            String str4 = c60042tp2.A02;
            if (!TextUtils.isEmpty(str4)) {
                arrayList.add(new C02590Ca("reason", (C04P[]) null, str4));
            }
            arrayList.add(new C02590Ca("catalog_session_id", (C04P[]) null, c60042tp2.A03));
            boolean A0B = c05y.A0B(193, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02, null, (byte) 0), new C04P("xmlns", "fb:thrift_iq", null, (byte) 0), new C04P("type", "set", null, (byte) 0), new C04P("to", C04260Jm.A00)}, new C02590Ca("request", new C04P[]{new C04P("type", "report_product", null, (byte) 0), new C04P("biz_jid", c60042tp2.A00, null, (byte) 0)}, (C02590Ca[]) arrayList.toArray(new C02590Ca[0]), null)), c33k, 32000L);
            StringBuilder A0P = C000200d.A0P("app/sendReportBizProduct productId=");
            A0P.append(str3);
            A0P.append(" success:");
            A0P.append(A0B);
            Log.i(A0P.toString());
            if (A0B) {
                A12(R.string.catalog_product_report_sending);
                return;
            }
            C2L3 c2l32 = this.A03;
            c2l32.A06.A02.post(new RunnableEBaseShape0S0210000_I0(c2l32, c60042tp, false, 0));
        }
    }

    @Override // X.C2N9
    public void ANM(C60042tp c60042tp, boolean z) {
        C468628o c468628o = this.A0Y;
        if (c468628o != null && c468628o.A09.equals(c60042tp.A01)) {
            ARS();
            if (z) {
                C49462Ko c49462Ko = this.A02;
                C468628o c468628o2 = this.A0Y;
                c49462Ko.A02(15, null, c468628o2 == null ? null : c468628o2.A09, this.A0Z);
                AUl(R.string.catalog_product_report_complete_title, R.string.catalog_product_report_complete_content, new Object[0]);
                return;
            }
            C49462Ko c49462Ko2 = this.A02;
            C468628o c468628o3 = this.A0Y;
            c49462Ko2.A02(16, null, c468628o3 == null ? null : c468628o3.A09, this.A0Z);
            AUj(R.string.catalog_product_report_complete_error);
        }
    }

    @Override // X.C2N4, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 55) {
            this.A04.A04(this, ((C2N4) this).A0M, this.A0Z, 2, Collections.singletonList(this.A0Y), this.A0Z, 0L, 0);
        }
    }

    @Override // X.C2N8, X.C2N4, X.C2N5, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.A01.A01(this.A0A);
        final InfoCard infoCard = (InfoCard) findViewById(R.id.product_business_info_container);
        this.A0T.A05.A05(this, new InterfaceC05620Pl() { // from class: X.34L
            {
                ProductDetailActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                ProductDetailActivity productDetailActivity = ProductDetailActivity.this;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (productDetailActivity == null) {
                    throw null;
                }
                if (booleanValue) {
                    productDetailActivity.finishAffinity();
                }
            }
        });
        this.A0T.A03.A05(this, new InterfaceC05620Pl() { // from class: X.34K
            {
                ProductDetailActivity.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                int i;
                ProductDetailActivity productDetailActivity = ProductDetailActivity.this;
                Bundle bundle2 = bundle;
                InfoCard infoCard2 = infoCard;
                C05210Nt c05210Nt = (C05210Nt) obj;
                C34S c34s = productDetailActivity.A0T;
                if (!c34s.A00 && c05210Nt == null) {
                    C49452Kn c49452Kn = c34s.A09;
                    c49452Kn.A06.A00(c49452Kn);
                    c34s.A00 = true;
                }
                CatalogMediaCard catalogMediaCard = ((C2N4) productDetailActivity).A0O;
                if (catalogMediaCard != null) {
                    C34S c34s2 = productDetailActivity.A0T;
                    if (c34s2 != null) {
                        if (c05210Nt != null && c05210Nt.A09 && (((i = c34s2.A02) == 1 || i == 5 || i == 6 || i == 7) && !c34s2.A01)) {
                            catalogMediaCard.setVisibility(0);
                            ((C2N4) productDetailActivity).A0O.setup(productDetailActivity.A0Z, bundle2 != null, productDetailActivity.A0c, false, c05210Nt);
                            View findViewById = productDetailActivity.findViewById(R.id.layout_frame);
                            View findViewById2 = productDetailActivity.findViewById(R.id.product_detail_container);
                            int A00 = C02160Ac.A00(productDetailActivity, R.color.chat_info_activity);
                            findViewById.setBackgroundColor(A00);
                            productDetailActivity.findViewById(R.id.divider).setVisibility(0);
                            ((C2N4) productDetailActivity).A0O.setBackgroundColor(A00);
                            findViewById2.setBackgroundColor(A00);
                        } else {
                            catalogMediaCard.setVisibility(8);
                        }
                    } else {
                        throw null;
                    }
                }
                if (infoCard2 != null && !productDetailActivity.A00.A0A(productDetailActivity.A0Z)) {
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) productDetailActivity.findViewById(R.id.contact_details);
                    if (c05210Nt != null && textEmojiLabel != null) {
                        if (TextUtils.isEmpty(c05210Nt.A03)) {
                            textEmojiLabel.setVisibility(8);
                            return;
                        }
                        textEmojiLabel.A03(c05210Nt.A03);
                        textEmojiLabel.setVisibility(0);
                    }
                }
            }
        });
        this.A05.A01(this.A0B);
        this.A03.A0F.add(this);
        if (infoCard != null && !this.A00.A0A(this.A0Z)) {
            findViewById(R.id.divider_bizinfo).setVisibility(0);
            infoCard.setVisibility(0);
            View findViewById = findViewById(R.id.contact_info_container);
            TextView textView = (TextView) findViewById(R.id.contact_name);
            ImageView imageView = (ImageView) findViewById(R.id.contact_photo);
            C018108l A00 = this.A07.A00(this.A0Z);
            String str = A00 == null ? null : A00.A08;
            C06C A0A = this.A06.A0A(this.A0Z);
            if (textView != null) {
                if (AnonymousClass024.A0j(str)) {
                    str = this.A08.A08(A0A, false);
                }
                textView.setText(str);
            }
            this.A09.A04(this).A02(A0A, imageView);
            findViewById.setOnClickListener(new ViewOnClickCListenerShape8S0100000_I0_0(this, 15));
        }
        C49452Kn c49452Kn = this.A0T.A09;
        c49452Kn.A0A.AS1(new RunnableEBaseShape0S0100000_I0_0(c49452Kn, 36));
        ((C2N4) this).A0I.A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2 == false) goto L8;
     */
    @Override // X.C2N4, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onCreateOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            android.view.MenuInflater r1 = r3.getMenuInflater()
            r0 = 2131623946(0x7f0e000a, float:1.8875058E38)
            r1.inflate(r0, r4)
            int r1 = r3.A00
            X.28o r0 = r3.A0Y
            boolean r2 = X.C34S.A00(r1, r0)
            r0 = 2131363509(0x7f0a06b5, float:1.8346829E38)
            android.view.MenuItem r1 = r4.findItem(r0)
            boolean r0 = r3.A0e
            if (r0 != 0) goto L20
            r0 = 1
            if (r2 != 0) goto L21
        L20:
            r0 = 0
        L21:
            r1.setVisible(r0)
            boolean r0 = super.onCreateOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.product.view.activity.ProductDetailActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // X.C2N4, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        this.A03.A0F.remove(this);
        this.A05.A00(this.A0B);
        this.A01.A00(this.A0A);
        super.onDestroy();
    }

    @Override // X.C2N4, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (R.id.menu_forward == itemId) {
            int i = ((C2N4) this).A00;
            C468628o c468628o = this.A0Y;
            if (C34S.A00(i, c468628o)) {
                this.A04.A04(this, ((C2N4) this).A0M, this.A0Z, 3, Collections.singletonList(c468628o), null, 0L, 0);
            }
            return true;
        } else if (R.id.menu_share == itemId) {
            UserJid userJid = this.A0Z;
            String str = this.A0c;
            Intent intent = new Intent(this, ShareProductLinkActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("jid", userJid.getRawString());
            intent.putExtra("product_id", str);
            startActivity(intent);
            return true;
        } else if (R.id.menu_report == itemId) {
            AUg(new CatalogReportDialogFragment(), null);
            return true;
        } else if (16908332 == itemId) {
            C34S c34s = this.A0T;
            if (c34s != null) {
                if (getIntent().getBooleanExtra("is_from_product_detail_screen", false)) {
                    if (Build.VERSION.SDK_INT < 29) {
                        onStateNotSaved();
                    }
                    c34s.A05.A0B(Boolean.TRUE);
                    return true;
                }
                onBackPressed();
                return true;
            }
            throw null;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }
}
