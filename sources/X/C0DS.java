package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;

/* renamed from: X.0DS */
/* loaded from: classes.dex */
public abstract class C0DS extends C0DT {
    public C02L A00;
    public AbstractC06480Tm A01;
    public C0E6 A02;
    public C41541u6 A03;
    public C05W A04;
    public C41321tj A05;
    public C000400f A06;
    public C03290Fc A07;
    public C49552Lb A08;
    public C41181tV A09;
    public C42711wC A0A;
    public C23Y A0B;
    public C02960Do A0C;
    public C0C8 A0D;
    public C0CC A0E;
    public C42431vj A0F;
    public C05N A0G;
    public C42721wD A0H;
    public C0EB A0I;
    public C2CS A0J;
    public C49562Lc A0K;
    public C0ES A0L;
    public C40291rx A0M;
    public C41511u2 A0N;
    public C0EG A0O;
    public C2Aa A0P;
    public C05G A0Q;
    public C0CB A0R;
    public AbstractC40441sG A0S;
    public C26S A0T;
    public C40431sF A0U;
    public InterfaceC002901k A0V;
    public final boolean A0W = false;

    public void A1P() {
    }

    public void A1Q(int i) {
    }

    public void A1R(C03860Hk c03860Hk) {
    }

    public C0DS() {
    }

    public C0DS(boolean z) {
    }

    public /* synthetic */ void A1S(Integer num) {
        if (num.intValue() == 0) {
            Log.e("VerifyMessageStoreActivity/messagestoreverified/missing-params bounce to regphone");
            this.A0P.A0B(1);
            startActivity(RegisterPhone.A00(this));
            finish();
        }
    }

    public void A1T(boolean z) {
        this.A01.A0A(z, true);
    }

    public final boolean A1U() {
        AbstractC06480Tm abstractC06480Tm = this.A01;
        return ((C2La) abstractC06480Tm).A05.A09(abstractC06480Tm.A04);
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 200) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (A1U()) {
                this.A01.A08();
            }
        } else {
            A1T(false);
        }
    }

    @Override // X.C0DT, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C06490Tn c06490Tn = new C06490Tn(this, this, ((ActivityC02290Ap) this).A0A, this.A00, this.A0V, this.A09, this.A0O, this.A0I, this.A03, this.A02, this.A04, this.A0B, this.A0M, this.A07, this.A0J, this.A0L, this.A0U, this.A0S, this.A0R, this.A06, this.A05, this.A0E, this.A0N, this.A0P, this.A0C, this.A08, this.A0T, this.A0A, this.A0D, this.A0F, this.A0H, this.A0G, this.A0K, this.A0W);
        this.A01 = c06490Tn;
        ((C2La) c06490Tn).A00.A05(this, new InterfaceC05620Pl() { // from class: X.1he
            {
                C0DS.this = this;
            }

            @Override // X.InterfaceC05620Pl
            public final void AIK(Object obj) {
                C0DS.this.A1S((Integer) obj);
            }
        });
    }

    @Override // X.ActivityC02270An, android.app.Activity
    public Dialog onCreateDialog(int i) {
        Dialog dialog;
        final AbstractC06480Tm abstractC06480Tm = this.A01;
        if (abstractC06480Tm != null) {
            if (i == 100) {
                Log.i("verifymsgstore/dialog/setup");
                Activity activity = abstractC06480Tm.A01;
                ProgressDialogC06500To progressDialogC06500To = new ProgressDialogC06500To(activity);
                AbstractC06480Tm.A08 = progressDialogC06500To;
                progressDialogC06500To.setTitle(activity.getString(R.string.msg_store_migrate_title));
                AbstractC06480Tm.A08.setMessage(activity.getString(R.string.msg_store_migrate_message));
                AbstractC06480Tm.A08.setIndeterminate(false);
                AbstractC06480Tm.A08.setCancelable(false);
                AbstractC06480Tm.A08.setProgressStyle(1);
                dialog = AbstractC06480Tm.A08;
            } else if (i == 101) {
                Log.i("verifymsgstore/dialog/msgstoreerror");
                C019208x c019208x = new C019208x(abstractC06480Tm.A01);
                c019208x.A03(R.string.alert);
                c019208x.A02(R.string.msg_store_error_found);
                c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.1JQ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        abstractC06480Tm.A01.finish();
                    }
                });
                dialog = c019208x.A00();
            } else if (i == 200) {
                Log.i("verifymsgstore/dialog/cannot-connect");
                dialog = abstractC06480Tm.A04(200, R.string.msg_store_unable_to_start_restore_no_connectivity);
            } else if (i == 201) {
                Log.i("verifymsgstore/dialog/keyserviceunavailable");
                dialog = abstractC06480Tm.A04(201, R.string.msg_store_unable_to_start_restore_process);
            } else {
                switch (i) {
                    case 103:
                        Log.i("verifymsgstore/dialog/restore");
                        C019208x c019208x2 = new C019208x(abstractC06480Tm.A01);
                        c019208x2.A03(R.string.msg_store_backup_found);
                        c019208x2.A02(R.string.msg_store_creation_backup_message);
                        c019208x2.A06(R.string.yes, new DialogInterface.OnClickListener() { // from class: X.1JR
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                AbstractC06480Tm abstractC06480Tm2 = abstractC06480Tm;
                                C002701i.A18(abstractC06480Tm2.A01, 103);
                                abstractC06480Tm2.A00 = true;
                                abstractC06480Tm2.A0A(true, false);
                            }
                        });
                        c019208x2.A04(R.string.no, new DialogInterface.OnClickListener() { // from class: X.1JF
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                Activity activity2 = abstractC06480Tm.A01;
                                C002701i.A18(activity2, 103);
                                C002701i.A19(activity2, 106);
                            }
                        });
                        c019208x2.A01.A0J = false;
                        dialog = c019208x2.A00();
                        break;
                    case 104:
                        Log.i("verifymsgstore/dialog/groupsync");
                        Activity activity2 = abstractC06480Tm.A01;
                        ProgressDialogC06500To progressDialogC06500To2 = new ProgressDialogC06500To(activity2);
                        progressDialogC06500To2.setTitle(R.string.register_xmpp_title);
                        progressDialogC06500To2.setMessage(activity2.getString(R.string.register_wait_message));
                        progressDialogC06500To2.setIndeterminate(true);
                        progressDialogC06500To2.setCancelable(false);
                        return progressDialogC06500To2;
                    case 105:
                        Log.i("verifymsgstore/dialog/restoreduetoerror");
                        StringBuilder sb = new StringBuilder();
                        Activity activity3 = abstractC06480Tm.A01;
                        sb.append(activity3.getString(R.string.msg_store_lost_due_to_previous_error));
                        sb.append(" ");
                        sb.append(activity3.getString(R.string.msg_store_creation_backup_message_restore_due_to_error));
                        String obj = sb.toString();
                        C019208x c019208x3 = new C019208x(activity3);
                        c019208x3.A03(R.string.msg_store_backup_found_title);
                        C019308y c019308y = c019208x3.A01;
                        c019308y.A0E = obj;
                        c019208x3.A06(R.string.msg_store_restore_db, new DialogInterface.OnClickListener() { // from class: X.1JP
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                AbstractC06480Tm abstractC06480Tm2 = abstractC06480Tm;
                                C002701i.A18(abstractC06480Tm2.A01, 105);
                                Log.i("verifymsgstore/dialog/restoreduetoerror/restore");
                                abstractC06480Tm2.A00 = true;
                                abstractC06480Tm2.A0A(true, false);
                            }
                        });
                        c019208x3.A04(R.string.msg_store_do_not_restore, new DialogInterface.OnClickListener() { // from class: X.1JI
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                Activity activity4 = abstractC06480Tm.A01;
                                C002701i.A18(activity4, 105);
                                Log.i("verifymsgstore/dialog/restoreduetoerror/skiprestore");
                                C002701i.A19(activity4, 106);
                            }
                        });
                        c019308y.A0J = false;
                        dialog = c019208x3.A00();
                        break;
                    case 106:
                        C019208x c019208x4 = new C019208x(abstractC06480Tm.A01);
                        c019208x4.A03(R.string.msg_store_confirm);
                        c019208x4.A02(R.string.dont_restore_message);
                        c019208x4.A06(R.string.msg_store_do_not_restore, new DialogInterface.OnClickListener() { // from class: X.1JT
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                AbstractC06480Tm abstractC06480Tm2 = abstractC06480Tm;
                                C002701i.A18(abstractC06480Tm2.A01, 106);
                                Log.i("verifymsgstore/dialog/checknorestore/skiprestore");
                                abstractC06480Tm2.A00 = false;
                                abstractC06480Tm2.A0A(false, false);
                            }
                        });
                        c019208x4.A04(R.string.cancel, new DialogInterface.OnClickListener() { // from class: X.1JH
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                AbstractC06480Tm abstractC06480Tm2 = abstractC06480Tm;
                                C002701i.A18(abstractC06480Tm2.A01, 106);
                                Log.i("verifymsgstore/dialog/checknorestore/restore");
                                abstractC06480Tm2.A00 = true;
                                abstractC06480Tm2.A0A(true, false);
                            }
                        });
                        c019208x4.A01.A0J = false;
                        dialog = c019208x4.A00();
                        break;
                    case 107:
                        Log.i("verifymsgstore/dialog/restorefrombackupduetoerrorcardnotfoundaskretry");
                        StringBuilder sb2 = new StringBuilder();
                        Activity activity4 = abstractC06480Tm.A01;
                        sb2.append(activity4.getString(R.string.msg_store_lost_due_to_previous_error));
                        sb2.append(" ");
                        boolean A01 = C000400f.A01();
                        int i2 = R.string.msg_store_media_card_not_found_ask_retry_shared_storage;
                        if (A01) {
                            i2 = R.string.msg_store_media_card_not_found_ask_retry;
                        }
                        sb2.append(activity4.getString(i2));
                        String obj2 = sb2.toString();
                        C019208x c019208x5 = new C019208x(activity4);
                        c019208x5.A03(R.string.alert);
                        C019308y c019308y2 = c019208x5.A01;
                        c019308y2.A0E = obj2;
                        c019208x5.A06(R.string.retry, new DialogInterface.OnClickListener() { // from class: X.1JO
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                abstractC06480Tm.A07();
                            }
                        });
                        c019208x5.A04(R.string.skip, new DialogInterface.OnClickListener() { // from class: X.1JK
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                AbstractC06480Tm abstractC06480Tm2 = abstractC06480Tm;
                                C002701i.A18(abstractC06480Tm2.A01, 107);
                                abstractC06480Tm2.A00 = false;
                                abstractC06480Tm2.A0A(false, false);
                            }
                        });
                        c019308y2.A0J = false;
                        dialog = c019208x5.A00();
                        break;
                    case C0M6.A03 /* 108 */:
                        Log.i("verifymsgstore/dialog/msgstorenotrestored");
                        C019208x c019208x6 = new C019208x(abstractC06480Tm.A01);
                        c019208x6.A03(R.string.alert);
                        c019208x6.A02(R.string.msg_store_error_not_restored);
                        c019208x6.A06(R.string.ok, null);
                        dialog = c019208x6.A00();
                        break;
                    default:
                        return super.onCreateDialog(i);
                }
            }
            if (dialog != null) {
                return dialog;
            }
            return super.onCreateDialog(i);
        }
        throw null;
    }
}
