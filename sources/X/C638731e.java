package X;

import android.accounts.Account;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.31e */
/* loaded from: classes2.dex */
public class C638731e extends C0HS {
    public final C018508q A00;
    public final C469829b A01;
    public final AnonymousClass323 A02;
    public final AnonymousClass034 A03;
    public final C001200o A04;
    public final C000500h A05;
    public final C0CC A06;
    public final WeakReference A08;
    public final Set A09;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final Account[] A0D;
    public final Timer A0A = new Timer("perform-one-time-setup");
    public final C0HC A07 = new C0HC("gdrive-activity/one-time-setup");

    public C638731e(C001200o c001200o, C018508q c018508q, AnonymousClass034 anonymousClass034, C0CC c0cc, C000500h c000500h, AnonymousClass323 anonymousClass323, C469829b c469829b, RestoreFromBackupActivity restoreFromBackupActivity, Account[] accountArr, Set set, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A04 = c001200o;
        this.A00 = c018508q;
        this.A03 = anonymousClass034;
        this.A06 = c0cc;
        this.A05 = c000500h;
        this.A02 = anonymousClass323;
        this.A01 = c469829b;
        this.A0D = accountArr;
        this.A09 = set;
        this.A0C = atomicBoolean;
        this.A0B = atomicBoolean2;
        this.A08 = new WeakReference(restoreFromBackupActivity);
    }

    @Override // X.C0HS
    public void A06() {
        this.A0A.schedule(new C55622lv(this), 30000L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x018f, code lost:
        if (r11 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0191, code lost:
        r4 = r30.A0C;
        r3 = r30.A06;
        r4.set(X.C40061rW.A0L(r3.A0B(), r4.get(), r8.A0I(), r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x01aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01ab, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01b0, code lost:
        r14 = r11.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x01b2, code lost:
        if (r14 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01b4, code lost:
        X.C000700j.A00();
        r18 = new X.C0HC("gdrive/backup/selector/decide");
        r12 = r11.A01;
        r2 = r12.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01c5, code lost:
        if (r2 != null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01c8, code lost:
        r17 = r2.optBoolean("passwordProtectedBackupEnabled", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01cf, code lost:
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01d2, code lost:
        r10 = X.AnonymousClass088.A1A(r12, r14.A05, true);
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01d9, code lost:
        if (r10 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01db, code lost:
        r8 = r14.A0B;
        r5 = r8.A0K();
        r4 = r5.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x01e3, code lost:
        if (r3 >= r4) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x01e5, code lost:
        r2 = r5[r3];
        r0 = X.C40061rW.A07(r14.A07, r14.A08.A00, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x01f1, code lost:
        if (r0 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x01f3, code lost:
        r2 = (X.C40051rV) r10.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x01f9, code lost:
        if (r2 != null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x01fb, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x01fe, code lost:
        r0 = new java.lang.StringBuilder("gdrive/backup/selector/decide upload title is null for ");
        r0.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0211, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0212, code lost:
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0213, code lost:
        r7 = r8.A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0218, code lost:
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0219, code lost:
        com.whatsapp.util.Log.e("gdrive/backup/selector/device unable to access local backup", r3);
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x03b3, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03b4, code lost:
        com.whatsapp.util.Log.e("gdrive/backup/selector/one-time-setup/read-storage-permission-withdrawn/exiting", r1);
        r0 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r14.A0E.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x03c1, code lost:
        if (r0 != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03c3, code lost:
        r0.A1V();
        r0.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x03ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x03cb, code lost:
        com.whatsapp.util.Log.e("gdrive/backup/selector/decide", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x03d7, code lost:
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0352 A[Catch: all -> 0x0362, LOOP:2: B:329:0x034e->B:280:0x0352, LOOP_END, TRY_LEAVE, TryCatch #13 {all -> 0x0362, blocks: (B:278:0x034e, B:280:0x0352), top: B:329:0x034e }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x036f A[Catch: all -> 0x03d8, TryCatch #15 {all -> 0x03d8, blocks: (B:185:0x0049, B:187:0x0050, B:189:0x005a, B:190:0x0061, B:192:0x0069, B:225:0x018b, B:193:0x0085, B:194:0x008c, B:200:0x00d8, B:202:0x00fc, B:221:0x0146, B:223:0x016e, B:211:0x0121, B:208:0x010b, B:210:0x010d, B:227:0x0191, B:230:0x01b0, B:232:0x01b4, B:238:0x01d2, B:240:0x01db, B:242:0x01e5, B:244:0x01f3, B:246:0x01fb, B:250:0x0213, B:253:0x021f, B:255:0x0232, B:258:0x023b, B:276:0x032f, B:277:0x0349, B:281:0x0358, B:287:0x036b, B:289:0x036f, B:290:0x037d, B:291:0x03a3, B:293:0x03ae, B:283:0x0363, B:284:0x0366, B:286:0x0368, B:260:0x0241, B:268:0x0313, B:270:0x0319, B:274:0x0328, B:261:0x0251, B:263:0x0261, B:264:0x0271, B:266:0x0285, B:267:0x02c9, B:252:0x0219, B:247:0x01fe, B:248:0x0211, B:299:0x03b4, B:301:0x03c3, B:303:0x03cb, B:235:0x01c8, B:307:0x03d7, B:229:0x01ab, B:292:0x03a4), top: B:327:0x0049, inners: #4, #5, #9, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03a4 A[Catch: all -> 0x03b0, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x03d8, blocks: (B:185:0x0049, B:187:0x0050, B:189:0x005a, B:190:0x0061, B:192:0x0069, B:225:0x018b, B:193:0x0085, B:194:0x008c, B:200:0x00d8, B:202:0x00fc, B:221:0x0146, B:223:0x016e, B:211:0x0121, B:208:0x010b, B:210:0x010d, B:227:0x0191, B:230:0x01b0, B:232:0x01b4, B:238:0x01d2, B:240:0x01db, B:242:0x01e5, B:244:0x01f3, B:246:0x01fb, B:250:0x0213, B:253:0x021f, B:255:0x0232, B:258:0x023b, B:276:0x032f, B:277:0x0349, B:281:0x0358, B:287:0x036b, B:289:0x036f, B:290:0x037d, B:291:0x03a3, B:293:0x03ae, B:283:0x0363, B:284:0x0366, B:286:0x0368, B:260:0x0241, B:268:0x0313, B:270:0x0319, B:274:0x0328, B:261:0x0251, B:263:0x0261, B:264:0x0271, B:266:0x0285, B:267:0x02c9, B:252:0x0219, B:247:0x01fe, B:248:0x0211, B:299:0x03b4, B:301:0x03c3, B:303:0x03cb, B:235:0x01c8, B:307:0x03d7, B:229:0x01ab, B:292:0x03a4), top: B:327:0x0049, inners: #4, #5, #9, #12, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0358 A[EDGE_INSN: B:343:0x0358->B:281:0x0358 ?: BREAK  , SYNTHETIC] */
    @Override // X.C0HS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A07(java.lang.Object[] r31) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C638731e.A07(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.C0HS
    public void A09(Object obj) {
        C55702m3 c55702m3 = (C55702m3) obj;
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A08.get();
        if (restoreFromBackupActivity != null) {
            C000700j.A01();
            C0BA A01 = restoreFromBackupActivity.A0N().A0Q.A01("one-time-setup-taking-too-long");
            if (A01 != null) {
                ((DialogFragment) A01).A11();
            }
            if (C40061rW.A0G(restoreFromBackupActivity)) {
                StringBuilder sb = new StringBuilder("gdrive-activity/one-time-setup background task finished but parent activity has already exited, therefore, stopping the task. Data: ");
                sb.append(c55702m3);
                Log.i(sb.toString());
            } else {
                restoreFromBackupActivity.A0E = c55702m3;
                if (c55702m3 != null) {
                    restoreFromBackupActivity.A1g(22, null);
                    restoreFromBackupActivity.A1i(c55702m3);
                } else {
                    StringBuilder A0P = C000200d.A0P("gdrive-activity/one-time-setup/num-of-local-backup-files/");
                    A0P.append(((C0DS) restoreFromBackupActivity).A0E.A06());
                    Log.i(A0P.toString());
                    if (((C0DS) restoreFromBackupActivity).A0E.A06() > 0 && restoreFromBackupActivity.A0q.get()) {
                        Log.i("gdrive-activity/one-time-setup no google drive backups found but local backup exists.");
                        ((C0DS) restoreFromBackupActivity).A0E.A00 = 3;
                        restoreFromBackupActivity.A1g(23, null);
                        restoreFromBackupActivity.A1a();
                    } else {
                        boolean z = ((ActivityC02290Ap) restoreFromBackupActivity).A0F.A00.getBoolean("new_jid", false);
                        C000200d.A1C("gdrive-util/is-new-jid/", z);
                        if (z) {
                            restoreFromBackupActivity.A1b();
                            restoreFromBackupActivity.setResult(1);
                        } else {
                            Log.i("gdrive-activity/one-time-setup user is an existing user but has no google drive backups found and no local backups exist either, warn the user.");
                            ((C0DS) restoreFromBackupActivity).A0E.A00 = 4;
                            Bundle A012 = C000200d.A01("dialog_id", 14);
                            A012.putString("message", restoreFromBackupActivity.getString(R.string.gdrive_no_google_account_found_message));
                            A012.putBoolean("cancelable", false);
                            A012.putString("positive_button", restoreFromBackupActivity.getString(R.string.gdrive_give_permission_button_label));
                            A012.putString("negative_button", restoreFromBackupActivity.getString(R.string.skip));
                            PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                            promptDialogFragment.A0P(A012);
                            if (!C40061rW.A0G(restoreFromBackupActivity)) {
                                AbstractC02800Cx A0N = restoreFromBackupActivity.A0N();
                                if (A0N != null) {
                                    C02820Cz c02820Cz = new C02820Cz(A0N);
                                    c02820Cz.A09(0, promptDialogFragment, null, 1);
                                    c02820Cz.A05();
                                } else {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        C018508q c018508q = this.A00;
        Locale locale = Locale.ENGLISH;
        C0HC c0hc = this.A07;
        String.format(locale, "Load time: %.2f seconds", Double.valueOf(c0hc.A00() / 1000.0d));
        if (c018508q != null) {
            c0hc.A01();
            this.A0A.cancel();
            return;
        }
        throw null;
    }
}
