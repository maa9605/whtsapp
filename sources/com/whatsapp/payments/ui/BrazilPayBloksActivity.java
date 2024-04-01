package com.whatsapp.payments.ui;

import X.AbstractActivityC92474Kz;
import X.AbstractC466427q;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass012;
import X.AnonymousClass480;
import X.AnonymousClass481;
import X.C000700j;
import X.C013406l;
import X.C013606n;
import X.C02A;
import X.C02L;
import X.C03560Ge;
import X.C04630Le;
import X.C05V;
import X.C05W;
import X.C0DW;
import X.C0N1;
import X.C0N2;
import X.C0N7;
import X.C28N;
import X.C28Q;
import X.C28b;
import X.C40841sx;
import X.C41321tj;
import X.C45S;
import X.C45T;
import X.C47W;
import X.C47Y;
import X.C48M;
import X.C48Q;
import X.C48R;
import X.C49G;
import X.C49I;
import X.C4D0;
import X.C4EU;
import X.C4Ku;
import X.C77343i3;
import X.C77673ia;
import X.C77723if;
import X.C897048c;
import X.C897748j;
import X.C898248o;
import X.C898448q;
import X.C898548r;
import X.C899048w;
import X.C90454Bb;
import X.C90674Bz;
import X.C90904Cw;
import X.C92224Ib;
import X.InterfaceC002901k;
import X.InterfaceC60602uk;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class BrazilPayBloksActivity extends AbstractActivityC92474Kz {
    public C45S A00;
    public C05W A02;
    public C41321tj A03;
    public AnonymousClass012 A04;
    public C013606n A05;
    public C013406l A07;
    public C47W A08;
    public C90454Bb A09;
    public C47Y A0A;
    public C0DW A0B;
    public C897048c A0C;
    public C897748j A0D;
    public C898548r A0E;
    public C49G A0F;
    public C90904Cw A0G;
    public C4D0 A0H;
    public C49I A0I;
    public C45T A01 = null;
    public String A0J = null;
    public C0N2 A06 = null;

    public static long A02(AnonymousClass012 anonymousClass012, String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            i = Integer.parseInt(str);
        } else {
            i = 60;
        }
        return (long) Math.ceil((anonymousClass012.A05() + (i * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)) / 1000.0d);
    }

    public static void A03(C45T c45t, C0N1 c0n1, C28Q c28q) {
        HashMap hashMap = new HashMap();
        if (c28q == null) {
            AbstractC466427q abstractC466427q = (AbstractC466427q) c0n1.A06;
            if (abstractC466427q != null) {
                int i = abstractC466427q.A00;
                if (!((i & 1) > 0)) {
                    hashMap.put("sell_pending", "1");
                } else if ((i & 2) <= 0) {
                    hashMap.put("payout_pending", "1");
                }
            }
            c45t.A03("on_success", hashMap);
            return;
        }
        hashMap.put("error_code", String.valueOf(c28q.A00));
        c45t.A03("on_failure", hashMap);
    }

    public static /* synthetic */ void A04(C45T c45t, C28Q c28q) {
        if (c28q == null) {
            c45t.A00("on_success");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", String.valueOf(c28q.A00));
        c45t.A03("on_failure", hashMap);
    }

    public static /* synthetic */ void A05(C45T c45t, C898248o c898248o, C28Q c28q) {
        HashMap hashMap = new HashMap();
        if (c28q == null) {
            hashMap.put("business_name", c898248o.A02);
            hashMap.put("owner_full_name", c898248o.A04);
            hashMap.put("verify_type", c898248o.A05);
            hashMap.put("bank_name", c898248o.A01);
            hashMap.put("credential_id", c898248o.A03);
            c45t.A03("on_success", hashMap);
            return;
        }
        hashMap.put("error_code", String.valueOf(c28q.A00));
        c45t.A03("on_failure", hashMap);
    }

    public /* synthetic */ void A1X(C45T c45t, int i, C898448q c898448q, C28Q c28q) {
        JSONArray A01;
        HashMap hashMap = new HashMap();
        if (c28q != null) {
            hashMap.put("error_code", String.valueOf(c28q.A00));
            c45t.A03("on_failure", hashMap);
        } else if (c898448q != null) {
            hashMap.put("status", String.valueOf(i));
            if (i == 1) {
                Log.i("PAY: BrazilVerifyTaxId: Linked account, try to link merchant");
                hashMap.put("verify_type", c898448q.A08);
                hashMap.put("verify_id", c898448q.A07);
                hashMap.put("bank_code", c898448q.A02);
                hashMap.put("bank_name", c898448q.A03);
                hashMap.put("masked_account_number", c898448q.A05);
                hashMap.put("last4", c898448q.A04);
                hashMap.put("support_phone_number", c898448q.A06);
                c45t.A03("on_success", hashMap);
                return;
            }
            Log.i("PAY: BrazilVerifyTaxId: new merchant, try to reg merchant");
            List list = c898448q.A09;
            if (list == null || list.isEmpty() || (A01 = C47W.A01(list)) == null) {
                return;
            }
            hashMap.put("banks", A01.toString());
            c45t.A03("on_success", hashMap);
        } else {
            Log.w("PAY: BrazilPayBloksActivity startVerifyTaxId unexpected state");
        }
    }

    public /* synthetic */ void A1Y(final C45T c45t, C0N7 c0n7, final ArrayList arrayList, C28Q c28q) {
        final HashMap hashMap = new HashMap();
        if (c28q != null) {
            hashMap.put("error_code", String.valueOf(c28q.A00));
            c45t.A03("on_failure", hashMap);
        } else if (c0n7 != null && arrayList != null && !arrayList.isEmpty()) {
            ((C4Ku) this).A0I.A01().A02(c0n7, new C28N() { // from class: X.3iZ
                {
                    BrazilPayBloksActivity.this = this;
                }

                @Override // X.C28N
                public final void AH2(List list) {
                    BrazilPayBloksActivity.this.A1g(arrayList, c45t, hashMap);
                }
            });
        } else {
            C4Ku.A01(null, -233, c45t);
        }
    }

    public void A1Z(C45T c45t, C0N7 c0n7, boolean z, ArrayList arrayList, C28Q c28q) {
        String str;
        if (c28q == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("credential_id", c0n7.A07);
            hashMap.put("readable_name", C40841sx.A0E(((ActivityC02310Ar) this).A01, c0n7));
            C92224Ib c92224Ib = (C92224Ib) c0n7.A06;
            if (c92224Ib != null && ((str = c92224Ib.A0N) == null || !(!"DISABLED".equals(str)))) {
                hashMap.put("p2p_ineligible", "1");
            }
            hashMap.put("network_name", C0N7.A06(c0n7.A01));
            if (c92224Ib != null && !TextUtils.isEmpty(c92224Ib.A0E)) {
                hashMap.put("card_image_url", c92224Ib.A0E);
            }
            if (z) {
                hashMap.put("verified_state", "1");
                c45t.A03("on_success", hashMap);
                return;
            } else if (arrayList != null && !arrayList.isEmpty()) {
                if (C47W.A02(arrayList)) {
                    C4Ku.A01(null, -233, c45t);
                    return;
                }
                JSONArray A03 = this.A08.A03(arrayList);
                if (A03 != null) {
                    hashMap.put("verify_methods", A03.toString());
                }
                hashMap.put("verified_state", "0");
                c45t.A03("on_success", hashMap);
                return;
            } else if (c92224Ib != null && c92224Ib.A07) {
                hashMap.put("verified_state", "0");
                hashMap.put("card_need_device_binding", "1");
                c45t.A03("on_success", hashMap);
                return;
            } else {
                C4Ku.A01(null, -233, c45t);
                return;
            }
        }
        C4Ku.A01(null, c28q.A00, c45t);
    }

    public /* synthetic */ void A1a(C45T c45t, C28Q c28q) {
        if (c28q == null) {
            c45t.A00("on_success");
        } else if (this.A0D.A02(this, c28q)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("error_code", String.valueOf(c28q.A00));
            c45t.A03("on_failure", hashMap);
        }
    }

    public /* synthetic */ void A1b(C45T c45t, String str, C0N7 c0n7, C28Q c28q) {
        if (c28q == null && c0n7 != null) {
            c45t.A00("on_success");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("remaining_validates", "1");
        hashMap.put("next_resend_ts", String.valueOf(A02(this.A04, str)));
        C4Ku.A01(hashMap, c28q != null ? c28q.A00 : 0, c45t);
    }

    public /* synthetic */ void A1c(C45T c45t, List list, C28Q c28q) {
        if (c28q == null) {
            JSONArray A01 = C47W.A01(list);
            if (A01 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("banks", A01.toString());
                c45t.A03("on_success", hashMap);
                return;
            }
            c45t.A00("on_failure");
            return;
        }
        c45t.A00("on_failure");
    }

    public void A1d(String str, final C45T c45t, C28Q c28q) {
        if (c28q != null) {
            int i = c28q.A01;
            final HashMap hashMap = new HashMap();
            hashMap.put("remaining_retries", String.valueOf(i));
            hashMap.put("error_code", String.valueOf(c28q.A00));
            if (i >= 0) {
                C03560Ge A01 = ((C4Ku) this).A0I.A01();
                C77723if c77723if = new C77723if(i);
                C28N c28n = new C28N() { // from class: X.3ii
                    @Override // X.C28N
                    public final void AH2(List list) {
                        c45t.A03("on_failure", hashMap);
                    }
                };
                InterfaceC002901k interfaceC002901k = A01.A03;
                interfaceC002901k.ARy(new C28b(interfaceC002901k, A01.A01, A01.A02, str, c77723if, c28n) { // from class: X.3Jx
                    public final C013406l A00;
                    public final C77723if A01;
                    public final String A02;

                    {
                        this.A00 = r2;
                        this.A02 = str;
                        this.A01 = c77723if;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        List A0A = this.A00.A0A();
                        Iterator it = ((AbstractCollection) A0A).iterator();
                        while (it.hasNext()) {
                            C0N2 c0n2 = (C0N2) it.next();
                            if (this.A02.equals(c0n2.A07)) {
                                int i2 = this.A01.A00;
                                C0N8 c0n8 = (C0N8) c0n2.A06;
                                if (c0n8 != null) {
                                    c0n8.A04 = i2;
                                }
                            }
                        }
                        C60012tm A0A2 = A0A(A0A);
                        ArrayList arrayList = new ArrayList(1);
                        boolean z = A0A2.A01;
                        if (z) {
                            Iterator it2 = A0A2.A00.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                C0N2 c0n22 = (C0N2) it2.next();
                                if (this.A02.equals(c0n22.A07)) {
                                    arrayList.add(c0n22);
                                    break;
                                }
                            }
                        }
                        return z ? new C60012tm(true, arrayList) : A0A2;
                    }
                }, new Void[0]);
                return;
            }
            c45t.A03("on_failure", hashMap);
            return;
        }
        c45t.A00("on_success");
    }

    public void A1e(String str, final C45T c45t, C92224Ib c92224Ib, C28Q c28q) {
        if (c28q == null) {
            final HashMap hashMap = new HashMap();
            hashMap.put("remaining_validates", "1");
            hashMap.put("next_resend_ts", String.valueOf(A02(this.A04, str)));
            if (c92224Ib != null) {
                hashMap.put("verified_state", c92224Ib.A0X ? "1" : "0");
                ((C4Ku) this).A0I.A01().A02(c92224Ib.A05(), new C28N() { // from class: X.3ik
                    @Override // X.C28N
                    public final void AH2(List list) {
                        c45t.A03("on_success", hashMap);
                    }
                });
                return;
            }
            c45t.A03("on_success", hashMap);
            return;
        }
        C4Ku.A01(null, c28q.A00, c45t);
    }

    public /* synthetic */ void A1f(String str, C28Q c28q) {
        C45T c45t = this.A01;
        if (c45t == null) {
            Log.i("PAY: BrazilPayBloksActivity onActivityResult - appToAppBloksCallback is null!");
        } else if (c28q != null) {
            C4Ku.A01(null, c28q.A00, c45t);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("app_to_app_authorization_code", str);
            this.A01.A03("on_success", hashMap);
        }
    }

    public /* synthetic */ void A1g(ArrayList arrayList, C45T c45t, HashMap hashMap) {
        JSONArray A03 = this.A08.A03(arrayList);
        if (C47W.A02(arrayList)) {
            C4Ku.A01(null, -233, c45t);
            return;
        }
        if (A03 != null) {
            hashMap.put("verify_methods", A03.toString());
        }
        c45t.A03("on_success", hashMap);
    }

    public final void A1h(final Map map, final C45T c45t, final int i) {
        Object obj = map.get("full_name");
        if (obj != null) {
            String str = (String) obj;
            CharSequence charSequence = (CharSequence) map.get("tax_id");
            C000700j.A03(charSequence);
            String replaceAll = ((String) charSequence).replaceAll("[^\\d]", "");
            C02L c02l = ((C4Ku) this).A00;
            c02l.A05();
            UserJid userJid = c02l.A03;
            if (userJid != null) {
                String replaceAll2 = C04630Le.A03(userJid.user).replaceAll("[^\\d]", "");
                Object obj2 = map.get("address_street_name");
                if (obj2 != null) {
                    String str2 = (String) obj2;
                    String str3 = (String) map.get("address_houe_number");
                    String str4 = (String) map.get("address_extra_line");
                    String str5 = (String) map.get("address_neighborhood");
                    Object obj3 = map.get("address_city");
                    if (obj3 != null) {
                        String str6 = (String) obj3;
                        Object obj4 = map.get("address_state");
                        if (obj4 != null) {
                            String str7 = (String) obj4;
                            Object obj5 = map.get("address_postal_code");
                            if (obj5 != null) {
                                final AnonymousClass480 anonymousClass480 = new AnonymousClass480(this, ((ActivityC02290Ap) this).A0A, this.A0S, ((C4Ku) this).A05, ((C4Ku) this).A0F, ((C4Ku) this).A0C, ((C4Ku) this).A0L, str, replaceAll, replaceAll2, str2, str3, str4, str5, str6, str7, ((String) obj5).replaceAll("[^\\d]", ""));
                                final C48M c48m = new C48M() { // from class: X.4Cy
                                    {
                                        BrazilPayBloksActivity.this = this;
                                    }

                                    @Override // X.C48M
                                    public void ALG(C28Q c28q) {
                                        int i2;
                                        int i3 = c28q.A00;
                                        if (i3 != 1448 || (i2 = i) >= 1) {
                                            C4Ku.A01(null, i3, c45t);
                                        } else {
                                            BrazilPayBloksActivity.this.A1h(map, c45t, i2 + 1);
                                        }
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r2v0, types: [X.4D0, X.0HS] */
                                    @Override // X.C48M
                                    public void ALH(C0KK c0kk) {
                                        if ("COMPLETED".equals(c0kk.A02)) {
                                            BrazilPayBloksActivity brazilPayBloksActivity = BrazilPayBloksActivity.this;
                                            C0GZ c0gz = ((C4Ku) brazilPayBloksActivity).A0B;
                                            c0gz.A05(c0gz.A01("kyc"));
                                            if (brazilPayBloksActivity.A0B.A05()) {
                                                ?? r2 = new C0HS(brazilPayBloksActivity.A02, ((C4Ku) brazilPayBloksActivity).A0I, brazilPayBloksActivity.A03) { // from class: X.4D0
                                                    public final C05W A00;
                                                    public final C41321tj A01;
                                                    public final C0DV A02;

                                                    {
                                                        this.A00 = r1;
                                                        this.A02 = r2;
                                                        this.A01 = r3;
                                                    }

                                                    @Override // X.C0HS
                                                    public Object A07(Object[] objArr) {
                                                        ArrayList arrayList = new ArrayList();
                                                        C468428m c468428m = new C468428m(C22H.A0A);
                                                        c468428m.A00 = C468328l.A00();
                                                        c468428m.A04 = true;
                                                        Iterator it = this.A00.A0E().iterator();
                                                        while (it.hasNext()) {
                                                            C06C c06c = (C06C) it.next();
                                                            if (!C23X.A0P(c06c.A02())) {
                                                                Jid A03 = c06c.A03(UserJid.class);
                                                                arrayList.add(A03);
                                                                if (A03 != null) {
                                                                    c468428m.A02.add(A03);
                                                                }
                                                            }
                                                        }
                                                        if (this.A01.A01(c468428m.A01()).A00()) {
                                                            Iterator it2 = arrayList.iterator();
                                                            while (it2.hasNext()) {
                                                                C0DV c0dv = this.A02;
                                                                c0dv.A04();
                                                                c0dv.A08.A0E((UserJid) it2.next());
                                                            }
                                                            return null;
                                                        }
                                                        return null;
                                                    }
                                                };
                                                brazilPayBloksActivity.A0H = r2;
                                                brazilPayBloksActivity.A0W.ARy(r2, new Void[0]);
                                            }
                                            c45t.A00("on_success");
                                        }
                                    }
                                };
                                C899048w c899048w = anonymousClass480.A06;
                                C77343i3 A02 = c899048w.A02("FB", "KYC", true);
                                if (A02 != null && A02.A05.equalsIgnoreCase("FB")) {
                                    anonymousClass480.A00(A02, c48m);
                                    return;
                                } else {
                                    new C48R(anonymousClass480.A01, anonymousClass480.A02, anonymousClass480.A03, anonymousClass480.A05, anonymousClass480.A04, c899048w, "KYC").A00("FB", new C48Q() { // from class: X.4Bw
                                        @Override // X.C48Q
                                        public void AJs(C28Q c28q) {
                                            Log.e("PAY: BrazilPayBloksActivity/provider key iq returned null");
                                            c48m.ALG(c28q);
                                        }

                                        @Override // X.C48Q
                                        public void AO6(C77343i3 c77343i3) {
                                            anonymousClass480.A00(c77343i3, c48m);
                                        }
                                    });
                                    return;
                                }
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.C4Ku, X.C46I
    public boolean AEB(int i) {
        if (i == 442) {
            BrazilReTosFragment brazilReTosFragment = new BrazilReTosFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_consumer", true);
            bundle.putBoolean("is_merchant", false);
            brazilReTosFragment.A0P(bundle);
            AUh(brazilReTosFragment);
            return true;
        }
        return super.AEB(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(10:167|168|(3:302|303|(5:305|(3:307|308|309)|314|180|(11:182|(2:185|183)|186|187|(4:189|(2:192|190)|193|194)|195|(1:197)(1:288)|198|199|200|(2:202|(4:204|205|206|(6:208|209|210|(4:212|213|214|(2:216|(2:218|(2:265|266)(8:222|(1:224)(2:260|(1:262)(2:263|264))|225|(1:229)|231|(1:235)|237|(2:256|257)(4:245|246|247|(3:249|250|251)(1:252))))(2:267|268))(1:269))|273|274)(1:277))(2:281|282))(1:283))(1:289)))|170|171|(7:175|176|177|178|179|180|(0)(0))|296|(2:298|299)|180|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x018e, code lost:
        if (r38.equals("submit_verification_method") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x019a, code lost:
        if (r38.equals("get_kyc_status") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x01a6, code lost:
        if (r38.equals("set_onboarding_started") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x01b2, code lost:
        if (r38.equals("update_merchant_account") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x01be, code lost:
        if (r38.equals("handle_error_native") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x01ca, code lost:
        if (r38.equals("reg_merchant") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x01d6, code lost:
        if (r38.equals("send_taxid") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x01e2, code lost:
        if (r38.equals("reset_pin_from_card") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x01ee, code lost:
        if (r38.equals("refetch_verification_methods") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x01fa, code lost:
        if (r38.equals("bind_device") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0206, code lost:
        if (r38.equals("pre_link_merchant") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x0212, code lost:
        if (r38.equals("link_merchant") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x021e, code lost:
        if (r38.equals("dial_phone_number") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x022a, code lost:
        if (r38.equals("add_card") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0236, code lost:
        if (r38.equals("verify_card_otp") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0242, code lost:
        if (r38.equals("send_kyc_data") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x024e, code lost:
        if (r38.equals("get_payout_banks") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x025a, code lost:
        if (r38.equals("get_merchant_reg_data") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0266, code lost:
        if (r38.equals("show_account_removal_dialog") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0272, code lost:
        if (r38.equals("get_compliance_status") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x09e0, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x09e1, code lost:
        com.whatsapp.util.Log.w("PAY: TrustedDeviceKeyStore retrieveKeyPair failed", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0a5d A[Catch: 48f -> 0x0cf4, NoSuchAlgorithmException -> 0x0cf6, JSONException -> 0x0cf8, TryCatch #2 {48f -> 0x0cf4, blocks: (B:621:0x0944, B:628:0x0960, B:629:0x0964, B:650:0x09f2, B:652:0x0a5d, B:653:0x0a76, B:655:0x0a7c, B:656:0x0a8a, B:658:0x0a92, B:659:0x0a9b, B:661:0x0aa1, B:662:0x0aa9, B:663:0x0aae, B:665:0x0acb, B:666:0x0ad9, B:668:0x0aeb, B:670:0x0aef, B:672:0x0afd, B:673:0x0b01, B:675:0x0b07, B:678:0x0b54, B:679:0x0b58, B:681:0x0b5c, B:683:0x0b66, B:685:0x0b6d, B:687:0x0b73, B:693:0x0b82, B:695:0x0b89, B:697:0x0b91, B:698:0x0b94, B:700:0x0b9f, B:702:0x0ba8, B:703:0x0bab, B:705:0x0bbf, B:707:0x0bc5, B:709:0x0bc9, B:711:0x0bcd, B:712:0x0c16, B:714:0x0c1c, B:715:0x0c33, B:717:0x0c83, B:723:0x0c89, B:724:0x0c93, B:725:0x0c94, B:726:0x0c99, B:727:0x0c9a, B:728:0x0c9f, B:729:0x0ca0, B:730:0x0ca5, B:731:0x0ca6, B:732:0x0cad, B:733:0x0cae, B:739:0x0cb4, B:740:0x0cbe, B:741:0x0cbf, B:742:0x0cc4, B:743:0x0cc5, B:749:0x0ccb, B:750:0x0cd5, B:751:0x0cd6, B:752:0x0cdd, B:753:0x0cde, B:757:0x0ce2, B:758:0x0cec, B:667:0x0ae5, B:759:0x0ced, B:633:0x0987, B:635:0x0993, B:637:0x09a0, B:638:0x09c2, B:639:0x09c8, B:641:0x09d7, B:643:0x09dc, B:646:0x09e6, B:648:0x09ec, B:645:0x09e1, B:632:0x0982, B:760:0x0cee), top: B:775:0x0944 }] */
    /* JADX WARN: Removed duplicated region for block: B:759:0x0ced A[Catch: 48f -> 0x0cf4, NoSuchAlgorithmException -> 0x0cf6, JSONException -> 0x0cf8, TryCatch #2 {48f -> 0x0cf4, blocks: (B:621:0x0944, B:628:0x0960, B:629:0x0964, B:650:0x09f2, B:652:0x0a5d, B:653:0x0a76, B:655:0x0a7c, B:656:0x0a8a, B:658:0x0a92, B:659:0x0a9b, B:661:0x0aa1, B:662:0x0aa9, B:663:0x0aae, B:665:0x0acb, B:666:0x0ad9, B:668:0x0aeb, B:670:0x0aef, B:672:0x0afd, B:673:0x0b01, B:675:0x0b07, B:678:0x0b54, B:679:0x0b58, B:681:0x0b5c, B:683:0x0b66, B:685:0x0b6d, B:687:0x0b73, B:693:0x0b82, B:695:0x0b89, B:697:0x0b91, B:698:0x0b94, B:700:0x0b9f, B:702:0x0ba8, B:703:0x0bab, B:705:0x0bbf, B:707:0x0bc5, B:709:0x0bc9, B:711:0x0bcd, B:712:0x0c16, B:714:0x0c1c, B:715:0x0c33, B:717:0x0c83, B:723:0x0c89, B:724:0x0c93, B:725:0x0c94, B:726:0x0c99, B:727:0x0c9a, B:728:0x0c9f, B:729:0x0ca0, B:730:0x0ca5, B:731:0x0ca6, B:732:0x0cad, B:733:0x0cae, B:739:0x0cb4, B:740:0x0cbe, B:741:0x0cbf, B:742:0x0cc4, B:743:0x0cc5, B:749:0x0ccb, B:750:0x0cd5, B:751:0x0cd6, B:752:0x0cdd, B:753:0x0cde, B:757:0x0ce2, B:758:0x0cec, B:667:0x0ae5, B:759:0x0ced, B:633:0x0987, B:635:0x0993, B:637:0x09a0, B:638:0x09c2, B:639:0x09c8, B:641:0x09d7, B:643:0x09dc, B:646:0x09e6, B:648:0x09ec, B:645:0x09e1, B:632:0x0982, B:760:0x0cee), top: B:775:0x0944 }] */
    @Override // X.C4Ku, X.C46I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AQj(java.lang.String r38, java.util.Map r39, final X.C45T r40) {
        /*
            Method dump skipped, instructions count: 3470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.AQj(java.lang.String, java.util.Map, X.45T):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0031, code lost:
        if (r5.equals("get_consumer_next_screen") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x003b, code lost:
        if (r5.equals("smb_business_name") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0045, code lost:
        if (r5.equals("get_formatted_phone_number") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0050, code lost:
        if (r5.equals("clear_merchant_reg_data") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x005a, code lost:
        if (r5.equals("get_merchant_next_screen") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0064, code lost:
        if (r5.equals("open_fb_pay_hub") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x006f, code lost:
        if (r5.equals("store_merchant_reg_data") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0079, code lost:
        if (r5.equals("is_purchase_enabled") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0083, code lost:
        if (r5.equals("is_smb_build") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x008d, code lost:
        if (r5.equals("get_card_method_field_data") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0255, code lost:
        if (r7.equals("business_address_postcode") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0260, code lost:
        if (r7.equals("bank_code") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x026b, code lost:
        if (r7.equals("bank_account_number") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0277, code lost:
        if (r7.equals("business_address_city") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0283, code lost:
        if (r7.equals("business_address_street_name") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x028e, code lost:
        if (r7.equals("business_tax_id") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x029a, code lost:
        if (r7.equals("business_address_street_extra") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x02a5, code lost:
        if (r7.equals("owner_cpf") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x02b0, code lost:
        if (r7.equals("owner_dob") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x02bb, code lost:
        if (r7.equals("owner_email") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x02c6, code lost:
        if (r7.equals("owner_full_name") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x02d2, code lost:
        if (r7.equals("bank_account_type") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x02dd, code lost:
        if (r7.equals("business_name") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x02e9, code lost:
        if (r7.equals("bank_branch_number") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x02f5, code lost:
        if (r7.equals("business_address_neighborhood") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0301, code lost:
        if (r7.equals("business_address_state") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x030d, code lost:
        if (r7.equals("business_address_number") == false) goto L75;
     */
    @Override // X.C4Ku, X.C46I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String AQk(java.util.Map r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPayBloksActivity.AQk(java.util.Map, java.lang.String):java.lang.String");
    }

    @Override // X.C4Ku, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C45T c45t;
        String stringExtra;
        C92224Ib c92224Ib;
        super.onActivityResult(i, i2, intent);
        if (i != 100 || (c45t = this.A01) == null) {
            return;
        }
        if (i2 != -1) {
            C4Ku.A01(null, -232, c45t);
        } else if (intent == null) {
            c45t.A00("on_success");
        } else {
            Bundle extras = intent.getExtras();
            String string = extras.getString("STEP_UP_RESPONSE", null);
            if (string == null && (string = extras.getString("issuerMobileAppAuthResponse", null)) == null) {
                Log.e("PAY: BrazilPayBloksActivity onActivityResult - response is NULL");
                return;
            }
            String lowerCase = string.toLowerCase(Locale.US);
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1086574198) {
                if (hashCode != 568196142) {
                    if (hashCode != 1185244855 || !lowerCase.equals("approved")) {
                        return;
                    }
                    if (intent.hasExtra("STEP_UP_AUTH_CODE")) {
                        stringExtra = intent.getStringExtra("STEP_UP_AUTH_CODE");
                    } else {
                        stringExtra = intent.getStringExtra("TAV");
                    }
                    if (!TextUtils.isEmpty(stringExtra)) {
                        byte[] A03 = C05V.A03(this.A04, ((C4Ku) this).A00, false);
                        if (A03 != null) {
                            C90674Bz c90674Bz = new C90674Bz(this, ((ActivityC02290Ap) this).A0A, this.A07, ((C4Ku) this).A0I, ((C4Ku) this).A05, ((C4Ku) this).A0F, this.A05, this.A0A, ((C4Ku) this).A0C, ((C4Ku) this).A0L, stringExtra, C02A.A03(A03), this.A0J, new C77673ia(this, stringExtra));
                            C0N2 A08 = ((AnonymousClass481) c90674Bz).A03.A08(c90674Bz.A06);
                            if (A08 != null && (c92224Ib = (C92224Ib) A08.A06) != null && "VISA".equals(c92224Ib.A03)) {
                                Log.i("PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification with encrypted value");
                                c90674Bz.A00();
                                return;
                            }
                            Log.i("PAY: BrazilVerifyCardSendAuthCodeAction sendRequestCardVerification without encrypted value");
                            c90674Bz.A02(c90674Bz.A05);
                            return;
                        }
                        throw null;
                    }
                    this.A01.A00("on_success");
                    return;
                } else if (!lowerCase.equals("declined")) {
                    return;
                }
            } else if (!lowerCase.equals("failure")) {
                return;
            }
            C4Ku.A01(null, -232, this.A01);
        }
    }

    @Override // X.AbstractActivityC92474Kz, X.C4Ku, X.C4Kh, X.C47V, X.C47U, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        findViewById(R.id.bloks_background_layout).setBackgroundResource(R.drawable.round_rectangle);
        if (getIntent().getIntExtra("extra_setup_mode", 0) != 0) {
            getIntent().putExtra("screen_name", this.A0I.A02(true));
        }
        this.A00.A00 = this.A0G.A03;
        if (((C4Ku) this).A03 != null) {
            if (((C4Ku) this).A02.A03() && ((C4Ku) this).A02.A09()) {
                this.A0X = true;
            } else {
                final ProgressBar progressBar = (ProgressBar) findViewById(R.id.bloks_progress_bar);
                progressBar.setVisibility(0);
                ((C4Ku) this).A02.A08("on_demand", false, new InterfaceC60602uk() { // from class: X.4Dz
                    @Override // X.InterfaceC60602uk
                    public void AGr() {
                        progressBar.setVisibility(8);
                        C4Ku c4Ku = this;
                        ((ActivityC02290Ap) c4Ku).A0A.A07(R.string.payments_not_ready, 0);
                        c4Ku.finish();
                    }

                    @Override // X.InterfaceC60602uk
                    public void AJo() {
                        this.finish();
                    }

                    @Override // X.InterfaceC60602uk
                    public void APE() {
                        progressBar.setVisibility(8);
                        this.A1R();
                    }

                    @Override // X.InterfaceC60602uk
                    public void APe() {
                        progressBar.setVisibility(8);
                        C4Ku c4Ku = this;
                        ((ActivityC02290Ap) c4Ku).A0A.A07(R.string.payments_not_ready, 0);
                        c4Ku.finish();
                    }
                });
            }
            this.A09 = new C90454Bb(((ActivityC02310Ar) this).A01, this.A0B);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog A01 = new C4EU(((ActivityC02290Ap) this).A0A, this.A0W, this.A0S, ((C4Ku) this).A0I, ((C4Ku) this).A08, ((C4Ku) this).A0E, ((C4Ku) this).A05, this.A09, ((C4Ku) this).A0F, this.A0R, ((C4Ku) this).A0H, ((C4Ku) this).A0C).A01(this, i);
        return A01 != null ? A01 : super.onCreateDialog(i);
    }
}
