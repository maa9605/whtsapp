package java.lang;

import X.ActivityC02330At;
import X.AnonymousClass009;
import X.AnonymousClass277;
import X.C000200d;
import X.C000700j;
import X.C002301c;
import X.C014406v;
import X.C05C;
import X.C0FK;
import X.C0G5;
import X.C20Q;
import X.C20R;
import X.C25R;
import X.C25S;
import X.C25T;
import X.C2AS;
import X.C2Bk;
import X.C42021ut;
import X.C471429u;
import X.C82523qe;
import android.app.ProgressDialog;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.stickers.AddThirdPartyStickerPackActivity;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.util.crash.SigquitBasedANRDetector;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class RunnableEBaseShape0S2100000_I0 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public RunnableEBaseShape0S2100000_I0(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A03) {
            case 0:
                ((SettingsGoogleDrive) this.A00).A1Z(this.A01, this.A02);
                return;
            case 1:
                String str = this.A01;
                String str2 = this.A02;
                C20R c20r = ((C20Q) this.A00).A00;
                if (c20r.A0A) {
                    c20r.A0A = false;
                    ProgressDialog progressDialog = c20r.A00;
                    if (progressDialog != null && progressDialog.isShowing()) {
                        c20r.A00.dismiss();
                    }
                    c20r.A1D(str, str2);
                    return;
                }
                return;
            case 2:
                String str3 = this.A01;
                String str4 = this.A02;
                C000200d.A14("conversations-gdrive-observer/set-message ", str3);
                ConversationsFragment conversationsFragment = ((C471429u) this.A00).A04;
                conversationsFragment.A0A.setText(str4);
                conversationsFragment.A09.setText(str3);
                return;
            case 3:
                String str5 = this.A01;
                String str6 = this.A02;
                ConversationsFragment conversationsFragment2 = ((C471429u) this.A00).A04;
                conversationsFragment2.A0A.setText(str6);
                conversationsFragment2.A09.setText(str5);
                return;
            case 4:
                C42021ut c42021ut = (C42021ut) this.A00;
                C0FK c0fk = new C0FK(this.A01, this.A02);
                synchronized (c42021ut) {
                    Object obj = c0fk.A00;
                    if (TextUtils.isEmpty((CharSequence) obj)) {
                        c42021ut.A08.A04("addUnreadPaymentMethodUpdate empty credentialId");
                    } else {
                        C05C c05c = c42021ut.A04;
                        String A02 = c05c.A02("unread_payment_method_credential_ids");
                        if (A02 == null) {
                            A02 = "";
                        }
                        HashSet hashSet = new HashSet(Arrays.asList(TextUtils.split(A02, ";")));
                        hashSet.add(TextUtils.join(":", new String[]{(String) obj, (String) c0fk.A01}));
                        String join = TextUtils.join(";", hashSet);
                        C014406v c014406v = c42021ut.A08;
                        StringBuilder sb = new StringBuilder();
                        sb.append("addUnreadPaymentMethodUpdate/unreadCredential:");
                        sb.append(join);
                        c014406v.A07(null, sb.toString(), null);
                        c05c.A06("unread_payment_method_credential_ids", join);
                    }
                }
                c42021ut.A02();
                return;
            case 5:
                ((AnonymousClass277) this.A00).A03.A03(this.A01, this.A02);
                return;
            case 6:
                RegisterName registerName = (RegisterName) this.A00;
                ((TextView) registerName.A0y.findViewById(R.id.restore_info)).setText(registerName.getString(R.string.local_restore_info, null, this.A01, this.A02));
                return;
            case 7:
                String str7 = this.A01;
                String str8 = this.A02;
                C2Bk c2Bk = ((C2AS) this.A00).A0I;
                if (c2Bk != null) {
                    C000700j.A01();
                    Iterator it = ((AnonymousClass009) c2Bk).A00.iterator();
                    while (true) {
                        C0G5 c0g5 = (C0G5) it;
                        if (!c0g5.hasNext()) {
                            return;
                        }
                        C25R c25r = (C25R) c0g5.next();
                        if (c25r instanceof C25S) {
                            ((C25S) c25r).A00.A03();
                        } else if (!(c25r instanceof C25T)) {
                            if (c25r instanceof C82523qe) {
                                AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = ((C82523qe) c25r).A00;
                                if (str7.equals(addStickerPackDialogFragment.A04) && str8.equals(addStickerPackDialogFragment.A05)) {
                                    C002301c c002301c = addStickerPackDialogFragment.A01;
                                    addStickerPackDialogFragment.A00.A0I(c002301c.A0D(R.string.sticker_third_party_pack_add_success_message_with_app, addStickerPackDialogFragment.A06, c002301c.A06(R.string.localized_app_name)), 1);
                                    ActivityC02330At A09 = addStickerPackDialogFragment.A09();
                                    if (A09 != null) {
                                        Intent intent = new Intent();
                                        intent.putExtra("add_successful", true);
                                        A09.setResult(-1, intent);
                                        addStickerPackDialogFragment.A11();
                                    }
                                }
                            }
                        } else {
                            StickerStoreTabFragment stickerStoreTabFragment = ((C25T) c25r).A00;
                            if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                                ((StickerStoreMyTabFragment) stickerStoreTabFragment).A11();
                            }
                        }
                    }
                } else {
                    throw null;
                }
                break;
            case 8:
                ((SigquitBasedANRDetector) this.A00).A02(this.A01, this.A02);
                return;
            default:
                return;
        }
    }
}
