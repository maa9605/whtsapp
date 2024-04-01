package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Stack;

/* renamed from: X.46v  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C893946v {
    public static String A04;
    public static HashMap A05;
    public final C889345a A00;
    public final C889545c A01;
    public final C002301c A02;
    public final AnonymousClass011 A03;

    public C893946v(AnonymousClass011 anonymousClass011, C889545c c889545c, C002301c c002301c, C889345a c889345a) {
        this.A03 = anonymousClass011;
        this.A00 = c889345a;
        this.A01 = c889545c;
        this.A02 = c002301c;
    }

    public static C47V A00(C021209s c021209s) {
        return (C47V) ((C892046c) c021209s.A00.get(R.id.bloks_global_bloks_host)).A03;
    }

    public /* synthetic */ void A01(C021209s c021209s) {
        ((C892046c) c021209s.A00.get(R.id.bloks_global_bloks_host)).A03.onBackPressed();
        if (0 != 0) {
            Stack stack = this.A01.A02;
            stack.peek();
            ((AbstractMap) stack.peek()).putAll(null);
        }
    }

    public final void A02(C021209s c021209s, C47V c47v, HashMap hashMap, C09P c09p) {
        Object remove = hashMap.remove("clear_backstack");
        Object remove2 = hashMap.remove("get_params_from_stack");
        Object remove3 = hashMap.remove("camera_permission");
        C889545c c889545c = this.A01;
        Stack stack = c889545c.A02;
        stack.peek();
        HashMap hashMap2 = new HashMap((HashMap) stack.peek());
        if (remove2 != null) {
            hashMap2.putAll(hashMap);
            hashMap = hashMap2;
        }
        if (remove != null) {
            AbstractC02800Cx A0N = c47v.A0N();
            for (int i = 0; i < A0N.A03(); i++) {
                A0N.A0D();
                stack.size();
                HashMap hashMap3 = c889545c.A01;
                hashMap3.size();
                C889545c.A00(hashMap3);
                stack.pop();
            }
        }
        HashMap hashMap4 = c889545c.A01;
        C889545c.A00(hashMap4);
        stack.add(new HashMap());
        c889545c.A01(hashMap);
        if (c09p != null) {
            hashMap4.put("backpress", new C45T(c021209s, c889545c.A00, c09p));
        }
        if (remove3 != null) {
            c47v.A64();
        }
    }

    public void A03(C021209s c021209s, String str, HashMap hashMap, C09P c09p) {
        C47V A00 = A00(c021209s);
        A02(c021209s, A00, hashMap, null);
        if (c09p != null) {
            C889545c c889545c = this.A01;
            c889545c.A01.put("dialog", new C45T(c021209s, c889545c.A00, c09p));
        }
        AbstractC02800Cx abstractC02800Cx = ((C892046c) c021209s.A00.get(R.id.bloks_global_bloks_host)).A01;
        DialogFragment dialogFragment = (DialogFragment) abstractC02800Cx.A0Q.A01("bloks-dialog");
        if (dialogFragment != null) {
            dialogFragment.A16(false, false);
        }
        A00.A8Y(str, hashMap).A14(abstractC02800Cx, "bloks-dialog");
    }

    public void A04(C021209s c021209s, String str, HashMap hashMap, C09P c09p) {
        A04 = str;
        A05 = hashMap;
        C47V A00 = A00(c021209s);
        Bundle extras = A00.getIntent().getExtras();
        if (extras != null) {
            extras.putString("screen_name", str);
        }
        A02(c021209s, A00, hashMap, c09p);
        A00.A09 = A00.A8Y(str, hashMap);
        AbstractC02800Cx abstractC02800Cx = ((C892046c) c021209s.A00.get(R.id.bloks_global_bloks_host)).A01;
        if (abstractC02800Cx != null) {
            C02820Cz c02820Cz = new C02820Cz(abstractC02800Cx);
            c02820Cz.A01(R.id.bloks_fragment_container, A00.A09, null);
            c02820Cz.A03(str);
            c02820Cz.A04();
            return;
        }
        throw null;
    }
}
