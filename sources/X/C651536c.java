package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.group.NewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.36c  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C651536c implements C0O8 {
    public final /* synthetic */ ContactPickerFragment A00;

    @Override // X.C0O8
    public boolean ANE(C0U0 c0u0, Menu menu) {
        return false;
    }

    public C651536c(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    @Override // X.C0O8
    public boolean AGv(C0U0 c0u0, MenuItem menuItem) {
        int i;
        if (menuItem.getItemId() == R.id.menuitem_new_broadcast) {
            ContactPickerFragment contactPickerFragment = this.A00;
            int A07 = contactPickerFragment.A0K.A07(C01C.A2o);
            if (A07 > 0 && contactPickerFragment.A1w.size() > A07) {
                contactPickerFragment.A0a.AUm(contactPickerFragment.A0p.A0A(R.plurals.broadcast_reach_limit, A07, Integer.valueOf(A07)));
            } else {
                contactPickerFragment.A0i(new Intent(contactPickerFragment.A0a(), ListMembersSelector.class).putExtra("selected", C003101m.A0E(contactPickerFragment.A1w.keySet())));
            }
            contactPickerFragment.A0a.A00();
        } else if (menuItem.getItemId() == R.id.menuitem_new_group) {
            ContactPickerFragment contactPickerFragment2 = this.A00;
            int A06 = contactPickerFragment2.A0K.A06();
            if (A06 > 0 && contactPickerFragment2.A1w.size() > (i = A06 - 1)) {
                contactPickerFragment2.A0a.AUm(contactPickerFragment2.A0p.A0A(R.plurals.groupchat_reach_limit, i, Integer.valueOf(i)));
            } else {
                NewGroup.A00(contactPickerFragment2.A09(), 4, C003101m.A0E(contactPickerFragment2.A1w.keySet()));
            }
            contactPickerFragment2.A0a.A00();
            return false;
        } else if (menuItem.getItemId() == R.id.menuitem_share) {
            ContactPickerFragment contactPickerFragment3 = this.A00;
            boolean z = contactPickerFragment3.A0z().getBoolean("skip_preview", false);
            ArrayList arrayList = contactPickerFragment3.A1U;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (contactPickerFragment3.A1F.A0X((Uri) it.next()) != 1) {
                        break;
                    }
                }
            }
            if (z) {
                C002701i.A19(contactPickerFragment3.A09(), 1);
                return false;
            }
            contactPickerFragment3.A1M(null);
            return false;
        }
        return false;
    }

    @Override // X.C0O8
    public boolean AJ5(C0U0 c0u0, Menu menu) {
        ContactPickerFragment contactPickerFragment = this.A00;
        if (!contactPickerFragment.A1l && !contactPickerFragment.A1r && !contactPickerFragment.A1p) {
            menu.add(0, R.id.menuitem_new_broadcast, 0, R.string.new_broadcast).setShowAsAction(2);
            menu.add(0, R.id.menuitem_new_group, 0, R.string.menuitem_groupchat).setShowAsAction(2);
            return true;
        }
        menu.add(0, R.id.menuitem_share, 0, R.string.send).setIcon(R.drawable.input_send).setShowAsAction(2);
        return true;
    }

    @Override // X.C0O8
    public void AJK(C0U0 c0u0) {
        ContactPickerFragment contactPickerFragment = this.A00;
        Set set = contactPickerFragment.A1y;
        set.clear();
        Map map = contactPickerFragment.A1w;
        set.addAll(map.keySet());
        Handler handler = contactPickerFragment.A1s;
        Runnable runnable = contactPickerFragment.A1t;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200L);
        map.clear();
        contactPickerFragment.A0b.notifyDataSetChanged();
        contactPickerFragment.A0C = null;
    }
}
