package com.whatsapp.http;

import X.ActivityC02290Ap;
import X.ActivityC02330At;
import X.AnonymousClass011;
import X.AnonymousClass092;
import X.AnonymousClass095;
import X.AnonymousClass097;
import X.C000700j;
import X.C018308n;
import X.C018508q;
import X.C019208x;
import X.C01B;
import X.C01C;
import X.C09H;
import X.C0JJ;
import X.DialogInterfaceC019408z;
import X.InterfaceC002901k;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.http.GoogleSearchDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class GoogleSearchDialogFragment extends Hilt_GoogleSearchDialogFragment {
    public C018308n A00;
    public C018508q A01;
    public C01B A02;
    public AnonymousClass011 A03;
    public InterfaceC002901k A04;

    public static void A00(ActivityC02290Ap activityC02290Ap, C018508q c018508q, C01B c01b, AnonymousClass092 anonymousClass092) {
        File file;
        if (anonymousClass092 instanceof AnonymousClass095) {
            if (c01b.A0E(C01C.A2C)) {
                C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
                if (c09h != null && (file = c09h.A0F) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("image_file", file.getAbsolutePath());
                    bundle.putInt("search_query_type", 1);
                    GoogleSearchDialogFragment googleSearchDialogFragment = new GoogleSearchDialogFragment();
                    googleSearchDialogFragment.A0P(bundle);
                    activityC02290Ap.AUh(googleSearchDialogFragment);
                    return;
                }
                c018508q.A05(R.string.search_by_image_failed, 0);
            }
        } else if ((anonymousClass092 instanceof C0JJ) && c01b.A0E(C01C.A26)) {
            String A0G = anonymousClass092.A0G();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("search_query_type", 0);
            bundle2.putString("search_query_text", A0G);
            GoogleSearchDialogFragment googleSearchDialogFragment2 = new GoogleSearchDialogFragment();
            googleSearchDialogFragment2.A0P(bundle2);
            activityC02290Ap.AUh(googleSearchDialogFragment2);
        }
    }

    @Override // com.whatsapp.http.Hilt_GoogleSearchDialogFragment, com.whatsapp.base.Hilt_WaDialogFragment, androidx.fragment.app.DialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        if (C018308n.A00(context) instanceof ActivityC02290Ap) {
            return;
        }
        C000700j.A08(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        ActivityC02330At A0A = A0A();
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.2wl
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                String replace;
                GoogleSearchDialogFragment googleSearchDialogFragment = GoogleSearchDialogFragment.this;
                if (i == -1) {
                    Bundle A02 = googleSearchDialogFragment.A02();
                    ActivityC02330At A0A2 = googleSearchDialogFragment.A0A();
                    if (A0A2 instanceof ActivityC02290Ap) {
                        if (((ActivityC02290Ap) A0A2).A1F(R.string.quick_message_search_no_internet)) {
                            return;
                        }
                    } else {
                        C000700j.A08(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
                    }
                    int i2 = A02.getInt("search_query_type");
                    if (i2 != 0) {
                        if (i2 != 1) {
                            return;
                        }
                        String string = googleSearchDialogFragment.A02().getString("image_file");
                        ActivityC02330At A09 = googleSearchDialogFragment.A09();
                        if (A09 == null || A09.isFinishing()) {
                            return;
                        }
                        if (A09 instanceof ActivityC02290Ap) {
                            googleSearchDialogFragment.A04.ARy(new C0HS(googleSearchDialogFragment.A01, googleSearchDialogFragment.A03, (ActivityC02290Ap) A09, new File(string)) { // from class: X.3Cr
                                public WeakReference A00;
                                public final C018508q A01;
                                public final AnonymousClass011 A02;
                                public final C3ST A03 = new C3ST();
                                public final File A04;

                                {
                                    this.A01 = r2;
                                    this.A02 = r3;
                                    this.A00 = new WeakReference(r4);
                                    this.A04 = r5;
                                }

                                @Override // X.C0HS
                                public void A06() {
                                    ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A00.get();
                                    if (activityC02290Ap == null || activityC02290Ap.AFE()) {
                                        return;
                                    }
                                    activityC02290Ap.AUr(0, R.string.searching_image);
                                }

                                /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
                                    if (r2 != null) goto L25;
                                 */
                                /* JADX WARN: Not initialized variable reg: 2, insn: 0x0118: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:44:0x0118 */
                                @Override // X.C0HS
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public java.lang.Object A07(java.lang.Object[] r10) {
                                    /*
                                        Method dump skipped, instructions count: 292
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C66853Cr.A07(java.lang.Object[]):java.lang.Object");
                                }

                                @Override // X.C0HS
                                public void A09(Object obj) {
                                    String str = (String) obj;
                                    ActivityC02290Ap activityC02290Ap = (ActivityC02290Ap) this.A00.get();
                                    if (activityC02290Ap != null && !activityC02290Ap.AFE()) {
                                        activityC02290Ap.ARS();
                                        if (TextUtils.isEmpty(str)) {
                                            this.A01.A05(R.string.search_by_image_failed, 0);
                                            return;
                                        }
                                        C36631l7 c36631l7 = new C36631l7();
                                        c36631l7.A00 = Long.valueOf(this.A03.A00);
                                        this.A02.A09(c36631l7, 1);
                                        AnonymousClass011.A01(c36631l7, "");
                                        activityC02290Ap.A14(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                    }
                                }
                            }, new Void[0]);
                            return;
                        } else {
                            C000700j.A08(false, "GoogleSearchDialogFragment does not have a DialogActivity as a host");
                            return;
                        }
                    }
                    String string2 = googleSearchDialogFragment.A02().getString("search_query_text");
                    int A07 = googleSearchDialogFragment.A02.A07(C01C.A31);
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority("www.google.com").path("search").appendQueryParameter("ctx", A07 != 5 ? C000200d.A0D("wa", A07) : "wa");
                    int length = (2000 - appendQueryParameter.build().toString().getBytes().length) - 3;
                    Charset forName = Charset.forName("UTF-8");
                    byte[] array = forName.encode(string2).array();
                    try {
                        replace = URLEncoder.encode(string2, "UTF-8").replace("+", "%20");
                    } catch (UnsupportedEncodingException unused) {
                        Log.e("UrlUtils/truncateParameterForPercentEncoding UTF-8 encoding not supported");
                    }
                    if (replace.getBytes().length > length) {
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length && i4 < array.length) {
                            if (replace.charAt(i3) != '%') {
                                i3++;
                                if (i3 > length) {
                                    break;
                                }
                                i4++;
                            } else {
                                i3 += 3;
                                if (i3 > length) {
                                    break;
                                }
                                i4++;
                            }
                        }
                        while ((array[i4] & 192) == 128 && i4 > 0) {
                            i4--;
                        }
                        string2 = new String(Arrays.copyOfRange(array, 0, i4), forName);
                    } else if (string2 == null) {
                        C000700j.A08(false, "Failed to encode URI in UTF-8, this should not happen");
                    }
                    Uri build = appendQueryParameter.appendQueryParameter("q", string2).build();
                    if (build != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", build);
                        ActivityC02330At A092 = googleSearchDialogFragment.A09();
                        if (A092 == null || A092.isFinishing()) {
                            return;
                        }
                        googleSearchDialogFragment.A03.A0B(new AnonymousClass014() { // from class: X.1ld
                            {
                                new AnonymousClass015(1, 1, 1, false);
                            }
                        }, null, false);
                        googleSearchDialogFragment.A00.A06(A092, intent);
                        return;
                    }
                    C000700j.A08(false, "Failed to encode URI in UTF-8, this should not happen");
                }
            }
        };
        C019208x c019208x = new C019208x(A0A);
        c019208x.A06(R.string.action_search_web, onClickListener);
        c019208x.A04(R.string.cancel, null);
        c019208x.A02(R.string.quick_message_search_confirmation);
        DialogInterfaceC019408z A00 = c019208x.A00();
        A00.setCanceledOnTouchOutside(true);
        return A00;
    }
}
