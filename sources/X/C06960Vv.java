package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContactPicker;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0Vv */
/* loaded from: classes.dex */
public class C06960Vv {
    public static final BigDecimal A0B = new BigDecimal("1000");
    public static volatile C06960Vv A0C;
    public final C012005w A00;
    public final C018508q A01;
    public final C02L A02;
    public final C018608r A03;
    public final C49462Ko A04;
    public final AnonymousClass012 A05;
    public final C02F A06;
    public final C002301c A07;
    public final C0C9 A08;
    public final C2MD A09;
    public final InterfaceC002901k A0A;

    public C06960Vv(AnonymousClass012 anonymousClass012, C018508q c018508q, C02L c02l, InterfaceC002901k interfaceC002901k, C012005w c012005w, C018608r c018608r, C2MD c2md, C002301c c002301c, C0C9 c0c9, C02F c02f, C49462Ko c49462Ko) {
        this.A05 = anonymousClass012;
        this.A01 = c018508q;
        this.A02 = c02l;
        this.A0A = interfaceC002901k;
        this.A00 = c012005w;
        this.A03 = c018608r;
        this.A09 = c2md;
        this.A07 = c002301c;
        this.A08 = c0c9;
        this.A06 = c02f;
        this.A04 = c49462Ko;
    }

    public static C06960Vv A00() {
        if (A0C == null) {
            synchronized (C06960Vv.class) {
                if (A0C == null) {
                    A0C = new C06960Vv(AnonymousClass012.A00(), C018508q.A00(), C02L.A00(), C002801j.A00(), C012005w.A00(), C018608r.A02(), C2MD.A00(), C002301c.A00(), C0C9.A00(), C02F.A00(), C49462Ko.A00());
                }
            }
        }
        return A0C;
    }

    public static String A01(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i);
        return sb.toString();
    }

    public static BigDecimal A02(C09R c09r, long j) {
        int i = 0;
        while (true) {
            String str = c09r.A00;
            if (i < 3 - C09R.A00(str)) {
                j /= 10;
                i++;
            } else {
                return new BigDecimal(new BigInteger(Long.toString(j)), C09R.A00(str));
            }
        }
    }

    public SpannableString A03(C04160Iu c04160Iu) {
        if (c04160Iu.A08 != null && !TextUtils.isEmpty(c04160Iu.A02)) {
            C09R c09r = new C09R(c04160Iu.A02);
            C002301c c002301c = this.A07;
            String A03 = c09r.A03(c002301c, c04160Iu.A08, true);
            BigDecimal bigDecimal = c04160Iu.A09;
            if (bigDecimal != null && BigDecimal.ZERO.compareTo(bigDecimal) != 0) {
                SpannableString spannableString = new SpannableString(C000200d.A0I(A03, "  ", c09r.A03(c002301c, c04160Iu.A09, true)));
                spannableString.setSpan(new StrikethroughSpan(), 0, A03.length(), 33);
                return spannableString;
            }
            return new SpannableString(A03);
        }
        String str = c04160Iu.A03;
        if (str != null) {
            return new SpannableString(str);
        }
        return null;
    }

    public void A04(final ActivityC02290Ap activityC02290Ap, final C2N3 c2n3, final UserJid userJid, final int i, final List list, final AbstractC005302j abstractC005302j, final long j, final int i2) {
        if (list != null && list.size() != 0 && i2 < list.size()) {
            int i3 = 44;
            if (i != 1) {
                i3 = 55;
                if (i != 2) {
                    i3 = 66;
                    if (i != 3) {
                        i3 = 0;
                    }
                }
            }
            if (!this.A06.A06()) {
                int i4 = Build.VERSION.SDK_INT;
                int i5 = R.string.permission_storage_need_write_access_on_sending_product_v30;
                if (i4 < 30) {
                    i5 = R.string.permission_storage_need_write_access_on_sending_product;
                }
                RequestPermissionActivity.A06(activityC02290Ap, R.string.permission_storage_need_write_access_on_sending_product_request, i5, false, i3);
                return;
            }
            final C468628o c468628o = (C468628o) list.get(i2);
            if (c468628o.A00) {
                C02L c02l = this.A02;
                c02l.A05();
                if (userJid.equals(c02l.A03)) {
                    C49462Ko c49462Ko = this.A04;
                    String str = c468628o.A09;
                    AnonymousClass015 anonymousClass015 = c49462Ko.A04;
                    if (anonymousClass015.A01(c49462Ko.A00)) {
                        C36701lE c36701lE = new C36701lE();
                        c36701lE.A02 = 34;
                        c36701lE.A06 = c49462Ko.A00;
                        c36701lE.A08 = str;
                        int andSet = c49462Ko.A07.getAndSet(0);
                        if (andSet != 0) {
                            c36701lE.A03 = Integer.valueOf(andSet);
                        }
                        c49462Ko.A03.A08(c36701lE, anonymousClass015.A02);
                    }
                }
                c2n3.A02((C2A2) c468628o.A0D.get(0), 3, new InterfaceC49482Kq() { // from class: X.32s
                    {
                        C06960Vv.this = this;
                    }

                    @Override // X.InterfaceC49482Kq
                    public final void ALY(C40231ro c40231ro, Bitmap bitmap, final boolean z) {
                        final C06960Vv c06960Vv = C06960Vv.this;
                        final int i6 = i2;
                        final List list2 = list;
                        final ActivityC02290Ap activityC02290Ap2 = activityC02290Ap;
                        final int i7 = i;
                        final AbstractC005302j abstractC005302j2 = abstractC005302j;
                        final C468628o c468628o2 = c468628o;
                        final UserJid userJid2 = userJid;
                        final long j2 = j;
                        final C2N3 c2n32 = c2n3;
                        final C0CI c0ci = new C0CI();
                        c0ci.A01.A03(new C0CG() { // from class: X.32t
                            @Override // X.C0CG
                            public final void A54(Object obj) {
                                C06960Vv c06960Vv2 = c06960Vv;
                                boolean z2 = z;
                                int i8 = i6;
                                List list3 = list2;
                                ActivityC02290Ap activityC02290Ap3 = activityC02290Ap2;
                                int i9 = i7;
                                AbstractC005302j abstractC005302j3 = abstractC005302j2;
                                C468628o c468628o3 = c468628o2;
                                UserJid userJid3 = userJid2;
                                long j3 = j2;
                                C2N3 c2n33 = c2n32;
                                C0CI c0ci2 = c0ci;
                                C0FK c0fk = (C0FK) obj;
                                if (!z2 && i8 == list3.size() - 1) {
                                    activityC02290Ap3.ARS();
                                }
                                File file = (File) c0fk.A01;
                                if (c0fk.A00 == Boolean.FALSE) {
                                    activityC02290Ap3.AUj(R.string.catalog_product_send_message_failed);
                                    Log.w("product-details/send-product/temp file creation failed");
                                } else if (i9 == 2) {
                                    Intent A02 = Conversation.A02(activityC02290Ap3, abstractC005302j3);
                                    A02.putExtra("product", c468628o3);
                                    A02.putExtra("product_file", file);
                                    A02.putExtra("business_jid", userJid3.getRawString());
                                    C002701i.A1C(A02, "CatalogUtils", c06960Vv2.A05);
                                    activityC02290Ap3.startActivity(A02);
                                } else {
                                    Uri fromFile = Uri.fromFile(file);
                                    if (i9 == 1 && abstractC005302j3 != null) {
                                        c06960Vv2.A03.A0F(c468628o3, Collections.singletonList(abstractC005302j3), userJid3, fromFile, j3 > 0 ? c06960Vv2.A08.A0C(j3) : null);
                                        if (i8 < list3.size() - 1) {
                                            c06960Vv2.A04(activityC02290Ap3, c2n33, userJid3, i9, list3, abstractC005302j3, j3, i8 + 1);
                                        } else {
                                            activityC02290Ap3.setResult(-1);
                                            activityC02290Ap3.finish();
                                        }
                                    } else {
                                        Intent intent = new Intent(activityC02290Ap3, ContactPicker.class);
                                        intent.putExtra("send", true);
                                        intent.putExtra("skip_preview", true);
                                        intent.putExtra("file_path", file.getAbsolutePath());
                                        HashSet hashSet = new HashSet();
                                        hashSet.add(23);
                                        intent.putIntegerArrayListExtra("message_types", new ArrayList<>(hashSet));
                                        activityC02290Ap3.startActivityForResult(intent, 3);
                                    }
                                }
                                c0ci2.A03();
                            }
                        }, c06960Vv.A01.A06);
                        c06960Vv.A0A.AS1(new RunnableEBaseShape0S0300000_I0_0(c06960Vv, c0ci, bitmap, 0));
                    }
                }, new InterfaceC56142mm() { // from class: X.32q
                    {
                        C06960Vv.this = this;
                    }

                    @Override // X.InterfaceC56142mm
                    public final void AHM(C40231ro c40231ro) {
                        C06960Vv c06960Vv = C06960Vv.this;
                        List list2 = list;
                        int i6 = i2;
                        ActivityC02290Ap activityC02290Ap2 = activityC02290Ap;
                        String A0A = c06960Vv.A07.A0A(R.plurals.catalog_send_product_message, list2.size(), Integer.valueOf(i6 + 1), Integer.valueOf(list2.size()));
                        if (C06530Ts.A02) {
                            activityC02290Ap2.AVr(A0A);
                        } else {
                            activityC02290Ap2.A1C(A0A);
                        }
                        Log.i("product-details/send-product/async load begin");
                    }
                }, new InterfaceC56152mn() { // from class: X.32r
                    @Override // X.InterfaceC56152mn
                    public final void ALQ(C40231ro c40231ro) {
                        ActivityC02290Ap activityC02290Ap2 = activityC02290Ap;
                        activityC02290Ap2.ARS();
                        activityC02290Ap2.AUj(R.string.catalog_product_send_message_failed);
                        Log.w("product-details/send-product/product load failed");
                    }
                }, null);
            }
        }
    }
}
