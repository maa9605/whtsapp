package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.jid.UserJid;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/* renamed from: X.47V */
/* loaded from: classes3.dex */
public abstract class C47V extends C47U implements C46I {
    public C09O A00;
    public InterfaceC021309t A01;
    public C02L A02;
    public C45Z A03;
    public C889345a A04;
    public C47P A05;
    public AnonymousClass478 A06;
    public C47Q A07;
    public C893746t A08;
    public BloksDialogFragment A09;
    public AnonymousClass011 A0A;
    public final C889545c A0C = new C889545c();
    public boolean A0B = true;

    public static void A00(Intent intent, String str) {
        HashMap hashMap;
        Serializable serializableExtra = intent.getSerializableExtra("screen_params");
        if (serializableExtra == null) {
            hashMap = new HashMap();
        } else {
            hashMap = (HashMap) serializableExtra;
        }
        hashMap.put("referral_screen", str);
        intent.putExtra("screen_params", hashMap);
    }

    public InterfaceC021309t A1P() {
        AnonymousClass012 anonymousClass012 = ((ActivityC02270An) this).A08;
        C018508q c018508q = ((ActivityC02290Ap) this).A0A;
        AbstractC000600i abstractC000600i = ((ActivityC02290Ap) this).A08;
        C02L c02l = this.A02;
        C889545c c889545c = this.A0C;
        return new InterfaceC021309t(anonymousClass012, c018508q, abstractC000600i, c02l, c889545c, ((ActivityC02290Ap) this).A0E, this.A03, new C893946v(this.A0A, c889545c, ((ActivityC02310Ar) this).A01, this.A04), new C1WM(new C33311fh())) { // from class: X.46d
            public final InterfaceC021309t A00;
            public final AbstractC000600i A01;
            public final C018508q A02;
            public final C02L A03;
            public final C45Z A04;
            public final C889545c A05;
            public final C893946v A06;
            public final C02E A07;
            public final AnonymousClass012 A08;

            {
                this.A08 = anonymousClass012;
                this.A02 = c018508q;
                this.A01 = abstractC000600i;
                this.A03 = c02l;
                this.A05 = c889545c;
                this.A07 = r6;
                this.A04 = r7;
                this.A06 = r8;
                this.A00 = r9;
            }

            public static final HashMap A00(Map map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() instanceof Number) {
                        hashMap.put(AnonymousClass088.A0r((InterfaceC020509l) entry.getKey()), entry.getValue().toString());
                    } else {
                        hashMap.put(AnonymousClass088.A0r((InterfaceC020509l) entry.getKey()), entry.getValue() != C0A6.A00 ? AnonymousClass088.A0q((InterfaceC020509l) entry.getValue()).toString() : null);
                    }
                }
                return hashMap;
            }

            public final HashMap A01(Map map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    Object A0r = AnonymousClass088.A0r((InterfaceC020509l) entry.getKey());
                    if (entry.getValue() instanceof C0A8) {
                        try {
                            hashMap.put(A0r, entry.getValue() != C0A6.A00 ? A01((Map) AnonymousClass088.A0r((InterfaceC020509l) entry.getValue())) : null);
                        } catch (ClassCastException unused) {
                            hashMap.put(A0r, entry.getValue() != C0A6.A00 ? AnonymousClass088.A0q((InterfaceC020509l) entry.getValue()).toString() : null);
                        }
                    }
                }
                return hashMap;
            }

            public final void A02(String str) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        UserJid.get(str);
                        return;
                    } catch (C011305p e) {
                        UserJid.getFromIdentifier(str);
                        AbstractC000600i abstractC000600i2 = this.A01;
                        StringBuilder A0P = C000200d.A0P("bloks/openchat - Jid missing suffix: ");
                        A0P.append(e.getMessage());
                        abstractC000600i2.A09(A0P.toString(), null, true);
                        return;
                    }
                }
                throw new C011305p("Jid is Empty");
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:547:0x004c, code lost:
                if (r14.equals("wa.action.FinishActivityWithResult") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:550:0x0057, code lost:
                if (r14.equals("wa.action.bloks.LaunchDialog") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:553:0x0062, code lost:
                if (r14.equals("bk.action.string.MatchesRegex") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:556:0x006d, code lost:
                if (r14.equals("wa.action.ShowProgressBar") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:559:0x0078, code lost:
                if (r14.equals("wa.action.DismissDialog") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:562:0x0083, code lost:
                if (r14.equals("bk.action.io.DebugToast") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:565:0x008e, code lost:
                if (r14.equals("wa.action.FormatString") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:568:0x0099, code lost:
                if (r14.equals("wa.action.PopScreen") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:571:0x00a5, code lost:
                if (r14.equals("wa.action.GetFieldStatEventId") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:574:0x00b1, code lost:
                if (r14.equals("wa.action.Logging") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:577:0x00bd, code lost:
                if (r14.equals("wa.action.navigation.OpenContactInfo") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:580:0x00c9, code lost:
                if (r14.equals("wa.action.LoadScreenParam") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:583:0x00d5, code lost:
                if (r14.equals("wa.action.GetIntentParameter") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:586:0x00e1, code lost:
                if (r14.equals("wa.action.FinishActivity") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:589:0x00ed, code lost:
                if (r14.equals("wa.action.GetProcessedData") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:592:0x00f9, code lost:
                if (r14.equals("bk.action.io.Toast") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:595:0x0105, code lost:
                if (r14.equals("bk.action.session_store.Get") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:598:0x0111, code lost:
                if (r14.equals("wa.action.navigation.OpenChat") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:601:0x011d, code lost:
                if (r14.equals("wa.action.DismissProgressBar") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:604:0x0129, code lost:
                if (r14.equals("wa.action.SendFieldStatV2") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:607:0x0135, code lost:
                if (r14.equals("wa.action.array.Foldl") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:610:0x0141, code lost:
                if (r14.equals("wa.action.ResetFieldStats") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:613:0x014d, code lost:
                if (r14.equals("wa.action.IQRequest") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:616:0x0159, code lost:
                if (r14.equals("wa.action.GetFieldStatElapsedTime") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:619:0x0165, code lost:
                if (r14.equals("bk.action.bloks.LaunchDialog") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:622:0x0171, code lost:
                if (r14.equals("wa.action.GetAttributeValue") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:625:0x017d, code lost:
                if (r14.equals("wa.action.SaveScreenParam") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:628:0x0189, code lost:
                if (r14.equals("wa.action.bloks.OpenScreenWithBackpress") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:631:0x0195, code lost:
                if (r14.equals("wa.action.OpenUrl") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:634:0x01a1, code lost:
                if (r14.equals("wa.action.StartFieldStatTimer") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:637:0x01ad, code lost:
                if (r14.equals("bk.action.bloks.OpenScreen") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:640:0x01b9, code lost:
                if (r14.equals("wa.action.HandleError") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:643:0x01c5, code lost:
                if (r14.equals("wa.action.GetChildNode") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:646:0x01d1, code lost:
                if (r14.equals("wa.action.FormatStringV2") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:649:0x01dd, code lost:
                if (r14.equals("bk.action.navigation.OpenUrl") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:652:0x01e9, code lost:
                if (r14.equals("wa.action.ShowAlertDialog") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:655:0x01f5, code lost:
                if (r14.equals("wa.action.TimeInFuture") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:658:0x0201, code lost:
                if (r14.equals("bk.action.io.clipboard.SetString") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:661:0x020d, code lost:
                if (r14.equals("wa.action.SendFieldStat") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:664:0x0219, code lost:
                if (r14.equals("bk.action.array.Map") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:667:0x0225, code lost:
                if (r14.equals("wa.action.AsyncRequest") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:670:0x0231, code lost:
                if (r14.equals("bk.action.io.CurrentTimeMillis") == false) goto L3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:839:0x0700, code lost:
                if (r4.equals("hour") == false) goto L198;
             */
            /* JADX WARN: Code restructure failed: missing block: B:851:0x0762, code lost:
                if (r4.equals("second") == false) goto L198;
             */
            /* JADX WARN: Code restructure failed: missing block: B:854:0x076c, code lost:
                if (r4.equals("minute") == false) goto L198;
             */
            /* JADX WARN: Code restructure failed: missing block: B:926:0x0902, code lost:
                if (r9.equals("positive_btn_label") == false) goto L284;
             */
            /* JADX WARN: Code restructure failed: missing block: B:938:0x092d, code lost:
                if (r9.equals("negative_btn_label") == false) goto L284;
             */
            /* JADX WARN: Code restructure failed: missing block: B:941:0x0937, code lost:
                if (r9.equals("neutral_btn_label") == false) goto L284;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC021309t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public X.InterfaceC020509l A7h(X.C33971gl r22, X.C021109r r23, final X.C021209s r24) {
                /*
                    Method dump skipped, instructions count: 3426
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C892146d.A7h(X.1gl, X.09r, X.09s):X.09l");
            }
        };
    }

    public void A1Q() {
        String str = C893946v.A04;
        if (str == null) {
            str = getIntent().getStringExtra("screen_name");
        }
        if (!TextUtils.isEmpty(str)) {
            this.A09 = ((C4Ku) this).A8Y(str, C893946v.A05);
            AbstractC02800Cx A0N = A0N();
            if (A0N != null) {
                C02820Cz c02820Cz = new C02820Cz(A0N);
                c02820Cz.A01(R.id.bloks_fragment_container, this.A09, null);
                c02820Cz.A04();
                return;
            }
            throw null;
        }
    }

    public /* synthetic */ void lambda$onCreate$26$BloksActivity(View view) {
        onBackPressed();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C889545c c889545c = this.A0C;
        HashMap hashMap = c889545c.A01;
        C45T c45t = (C45T) hashMap.get("backpress");
        if (c45t != null) {
            c45t.A00("on_success");
            return;
        }
        AbstractC02800Cx A0N = A0N();
        if (A0N.A03() <= 1) {
            setResult(0, getIntent());
            C893946v.A04 = null;
            C893946v.A05 = null;
            finish();
            return;
        }
        A0N.A0D();
        A0N.A0B();
        Stack stack = c889545c.A02;
        stack.size();
        hashMap.size();
        C889545c.A00(hashMap);
        stack.pop();
        AbstractC02800Cx A0N2 = A0N();
        String name = ((C0D2) A0N2.A09.get(A0N2.A03() - 1)).getName();
        stack.peek();
        this.A09 = A8Y(name, (HashMap) stack.peek());
        C02820Cz c02820Cz = new C02820Cz(A0N);
        c02820Cz.A01(R.id.bloks_fragment_container, this.A09, null);
        c02820Cz.A04();
    }

    @Override // X.C47U, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        Serializable serializableExtra = getIntent().getSerializableExtra("screen_params");
        C889545c c889545c = this.A0C;
        C889545c.A00(c889545c.A01);
        c889545c.A02.add(new HashMap());
        if (serializableExtra != null) {
            c889545c.A01((Map) serializableExtra);
        }
        super.onCreate(bundle);
        try {
            AnonymousClass017.A00(getApplicationContext());
        } catch (IOException unused) {
        }
        setContentView(R.layout.activity_blok_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.A09();
        A0k(toolbar);
        C0U1 A0c = A0c();
        if (A0c != null) {
            A0c.A0H("");
            A0c.A0L(true);
        }
        C0We c0We = new C0We(((ActivityC02310Ar) this).A01, C02160Ac.A03(this, R.drawable.ic_back_teal));
        c0We.setColorFilter(getResources().getColor(R.color.dark_gray), PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(c0We);
        toolbar.setNavigationOnClickListener(new View$OnClickListenerC56742nv(this));
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C889545c c889545c = this.A0C;
        Stack stack = c889545c.A02;
        stack.size();
        HashMap hashMap = c889545c.A01;
        hashMap.size();
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            ((Map) it.next()).clear();
        }
        C889545c.A00(hashMap);
        c889545c.A00.A01.clear();
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        C45U c45u = this.A0C.A00;
        c45u.A01.size();
        c45u.A00 = false;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C889545c c889545c = this.A0C;
        if (c889545c != null) {
            ArrayList arrayList = (ArrayList) bundle.getSerializable("screen_manager_saved_state");
            if (arrayList != null) {
                Stack stack = c889545c.A02;
                stack.clear();
                stack.addAll(arrayList);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A01 == null) {
            this.A01 = A1P();
        }
        Context applicationContext = getApplicationContext();
        InterfaceC021309t interfaceC021309t = this.A01;
        C45Q.A0A();
        C25311Ew c25311Ew = new C25311Ew(C45Q.A01);
        C45Q.A0A();
        Map emptyMap = Collections.emptyMap();
        C47P c47p = this.A05;
        AnonymousClass478 anonymousClass478 = this.A06;
        C47Q c47q = this.A07;
        C09O c09o = this.A00;
        C893746t c893746t = this.A08;
        C09M.A0C = new C09M(applicationContext, interfaceC021309t, c25311Ew, C893846u.A00, new C25001Dr(), new C33821gW(), emptyMap, c47p, anonymousClass478, c47q, c09o, c893746t);
        C45U c45u = this.A0C.A00;
        Queue queue = c45u.A01;
        queue.size();
        c45u.A00 = true;
        while (!queue.isEmpty()) {
            Object poll = queue.poll();
            if (poll == null) {
                throw null;
            }
            ((Runnable) poll).run();
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Stack stack = this.A0C.A02;
        if (stack.size() > 0) {
            ArrayList arrayList = new ArrayList(stack.size());
            arrayList.addAll(stack);
            bundle.putSerializable("screen_manager_saved_state", arrayList);
        }
    }
}
