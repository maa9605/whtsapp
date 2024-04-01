package com.whatsapp.data;

import X.AbstractC005302j;
import X.AbstractC011205o;
import X.AnonymousClass024;
import X.AnonymousClass092;
import X.AnonymousClass097;
import X.C000200d;
import X.C000700j;
import X.C005402l;
import X.C011305p;
import X.C02160Ac;
import X.C03340Fh;
import X.C03710Gt;
import X.C03790Hb;
import X.C03870Hl;
import X.C05A;
import X.C05E;
import X.C05M;
import X.C06I;
import X.C0C8;
import X.C0C9;
import X.C0CD;
import X.C0CE;
import X.C0DU;
import X.C0F3;
import X.C0G5;
import X.C0GG;
import X.C0HC;
import X.C0HD;
import X.C0IT;
import X.C0TG;
import X.C25Q;
import X.C2KL;
import X.InterfaceC002901k;
import X.InterfaceC36451kp;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.data.ConversationDeleteService;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ConversationDeleteService extends C0TG {
    public long A00;
    public C05A A01;
    public C05M A02;
    public C03340Fh A03;
    public C0C9 A04;
    public C03710Gt A05;
    public C0C8 A06;
    public C25Q A07;
    public InterfaceC002901k A08;
    public final Handler A09;
    public final ConcurrentHashMap A0A;
    public final AtomicInteger A0B;
    public final AtomicInteger A0C;
    public final AtomicInteger A0D;

    public ConversationDeleteService() {
        super(ConversationDeleteService.class.getCanonicalName());
        this.A09 = new Handler(Looper.myLooper());
        this.A0B = new AtomicInteger(0);
        this.A0D = new AtomicInteger(0);
        this.A0A = new ConcurrentHashMap();
        this.A0C = new AtomicInteger(3);
    }

    public static void A00(Context context, String str, C03870Hl c03870Hl) {
        Log.i("conversation-delete-service/start-service");
        Intent intent = new Intent(context, ConversationDeleteService.class);
        intent.setAction(str);
        intent.putExtra("job_id", c03870Hl.A06);
        intent.putExtra("jid_to_delete", c03870Hl.A07.getRawString());
        C02160Ac.A06(context, intent);
    }

    public void A03(AbstractC005302j abstractC005302j, int i) {
        int max;
        this.A0C.set(2);
        C2KL c2kl = (C2KL) this.A0A.get(abstractC005302j);
        synchronized (c2kl) {
            int i2 = c2kl.A00;
            max = Math.max(0, i - i2);
            c2kl.A00 = i2 + max;
            c2kl.A01 -= max;
        }
        AtomicInteger atomicInteger = this.A0B;
        atomicInteger.addAndGet(max);
        AtomicInteger atomicInteger2 = this.A0D;
        if (atomicInteger2.get() != 0 && atomicInteger.get() <= atomicInteger2.get()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.A00 < 250) {
                return;
            }
            this.A00 = uptimeMillis;
            int i3 = (atomicInteger.get() * 100) / atomicInteger2.get();
            A04(getString(R.string.delete_wait_progress), getString(R.string.delete_wait_progress_text_with_percentage, Integer.valueOf(atomicInteger.get()), Integer.valueOf(atomicInteger2.get()), super.A01.A0H().format(i3 / 100.0d)), 3, i3);
            return;
        }
        Log.w("conversation-delete-service/delete-progress/totalMessagesAllJids not updated.");
    }

    public final void A04(String str, String str2, int i, int i2) {
        C005402l A00 = C0DU.A00(this);
        A00.A0J = "other_notifications@1";
        A00.A03 = -1;
        A00.A07.icon = R.drawable.notifybar;
        if (Build.VERSION.SDK_INT >= 21) {
            A00.A0I = "progress";
            A00.A06 = -1;
        }
        if (i == 2) {
            A00.A05 = 100;
            A00.A04 = i2;
            A00.A0T = true;
        } else if (i == 3) {
            A00.A05 = 100;
            A00.A04 = i2;
            A00.A0T = false;
        } else {
            throw new IllegalStateException(C000200d.A0D("unexpected value for progress bar style ", i));
        }
        A00.A05(16, false);
        A00.A05(2, true);
        A00.A0A(str);
        A00.A09(str2);
        if (AnonymousClass024.A0c()) {
            startForeground(13, A00.A01());
        } else {
            this.A09.post(new RunnableEBaseShape1S0200000_I0_1(this, A00, 38));
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0040: IGET  (r0 I:X.0Gt) = (r6 I:com.whatsapp.data.ConversationDeleteService) com.whatsapp.data.ConversationDeleteService.A05 X.0Gt, block:B:123:0x003b */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.whatsapp.data.ConversationDeleteService] */
    public final boolean A05(final C03870Hl c03870Hl) {
        ?? r6;
        int A01;
        int A012;
        AbstractC005302j abstractC005302j = c03870Hl.A07;
        try {
            InterfaceC36451kp interfaceC36451kp = new InterfaceC36451kp() { // from class: X.3Jq
                @Override // X.C0HB
                public boolean AUW() {
                    return false;
                }

                {
                    ConversationDeleteService.this = this;
                }

                @Override // X.InterfaceC36451kp
                public void AKU() {
                }

                @Override // X.InterfaceC36451kp
                public void ANO(int i, int i2) {
                    ConversationDeleteService.this.A03(c03870Hl.A07, i);
                }

                @Override // X.InterfaceC36451kp
                public void AOp() {
                }
            };
            C0IT c0it = (C0IT) this.A02.A0C().get(abstractC005302j);
            return (c0it == null || c0it.A0A <= 1 || TextUtils.isEmpty(c0it.A0Q)) ? this.A04.A0f(c03870Hl, interfaceC36451kp) : this.A07.A04(c03870Hl, interfaceC36451kp);
        } catch (IllegalStateException e) {
            Log.e("Error while deleting messages in batches, switching to old way of deleting...", e);
            int A013 = r6.A05.A01(abstractC005302j);
            C0C9 c0c9 = r6.A04;
            if (c0c9 != null) {
                C000700j.A00();
                C0HC c0hc = new C0HC("msgstore/deletemsgs/fallback");
                C0HC c0hc2 = new C0HC("msgstore/deletemedia");
                HashSet hashSet = new HashSet();
                try {
                    C05E c05e = c0c9.A0n;
                    C0CD A03 = c05e.A03();
                    C0CE c0ce = A03.A02;
                    String str = C0HD.A0U;
                    C05A c05a = c0c9.A0K;
                    Cursor A07 = c0ce.A07(str, new String[]{String.valueOf(c05a.A05(abstractC005302j))});
                    if (A07 != null) {
                        int columnIndexOrThrow = A07.getColumnIndexOrThrow("remove_files");
                        while (A07.moveToNext()) {
                            AnonymousClass092 A04 = c0c9.A0H.A04(A07, abstractC005302j, true, true);
                            if (A04 != null) {
                                AnonymousClass097 anonymousClass097 = (AnonymousClass097) A04;
                                boolean z = A07.getInt(columnIndexOrThrow) == 1;
                                String str2 = anonymousClass097.A06;
                                if (str2 != null) {
                                    hashSet.add(str2);
                                }
                                c0c9.A0a(anonymousClass097, z);
                            } else {
                                throw null;
                            }
                        }
                        A07.close();
                    }
                    A03.close();
                    StringBuilder A0P = C000200d.A0P("msgstore/deletemedia ");
                    A0P.append(abstractC005302j);
                    A0P.append(" timeSpent:");
                    A0P.append(c0hc2.A01());
                    Log.i(A0P.toString());
                    C0CD A042 = c05e.A04();
                    try {
                        C03790Hb A00 = A042.A00();
                        c0c9.A0i.A02(abstractC005302j);
                        c05e.A05();
                        if (c05e.A06.A0P(A042)) {
                            A01 = A042.A02.A01("message", "_id IN (\n   SELECT _id\n   FROM deleted_messages_ids_view\n   WHERE chat_row_id= ?)\n", new String[]{String.valueOf(c05a.A05(abstractC005302j))});
                        } else {
                            A01 = A042.A02.A01("messages", "media_wa_type != 8 AND _id IN (\n   SELECT _id\n   FROM deleted_messages_ids_view\n   WHERE chat_row_id= ?)\n", new String[]{String.valueOf(c05a.A05(abstractC005302j))});
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("msgstore/deletemsgs/count:");
                        sb.append(A01);
                        Log.i(sb.toString());
                        C06I c06i = c0c9.A1C;
                        try {
                            A042 = c06i.A02.A04();
                        } catch (SQLiteDatabaseCorruptException e2) {
                            Log.e("msgstore/deleteAllMessageThumbnailsFor-jid", e2);
                        }
                        try {
                            if (c06i.A0B()) {
                                A012 = A042.A02.A01("message_thumbnail", "message_row_id IN (SELECT _id FROM message WHERE chat_row_id = ?)", new String[]{String.valueOf(c06i.A00.A05(abstractC005302j))});
                            } else {
                                A012 = A042.A02.A01("message_thumbnails", "key_remote_jid = ?", new String[]{abstractC005302j.getRawString()});
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("msgstore/deleteAllMessageThumbnailsFor-jid/");
                            sb2.append(abstractC005302j);
                            sb2.append("/");
                            sb2.append(A012);
                            Log.i(sb2.toString());
                            A042.close();
                            c06i.A08(hashSet);
                            c0c9.A0U.A06(abstractC005302j);
                            c0c9.A0N.A02();
                            A00.A00();
                            A00.close();
                            A042.close();
                            StringBuilder sb3 = new StringBuilder("msgstore/deletemsgs/fallback ");
                            sb3.append(abstractC005302j);
                            sb3.append(" timeSpent:");
                            sb3.append(c0hc.A01());
                            Log.i(sb3.toString());
                            r6.A03(abstractC005302j, A013);
                            return true;
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th) {
                            try {
                                A042.close();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (SQLiteDiskIOException e3) {
                    c0c9.A0l.A00(1);
                    throw e3;
                }
            } else {
                throw null;
            }
        }
    }

    @Override // X.C0TG, X.C0O9, android.app.IntentService, android.app.Service
    public void onCreate() {
        Log.i("conversation-delete-service/onCreate");
        super.onCreate();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        Log.i("conversation-delete-service/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        String action;
        StringBuilder sb = new StringBuilder("conversation-delete-service/handleintent intent=");
        sb.append(intent);
        Log.i(sb.toString());
        if (intent != null && (action = intent.getAction()) != null) {
            long longExtra = intent.getLongExtra("job_id", -1L);
            C03710Gt c03710Gt = this.A05;
            C0CD A03 = c03710Gt.A04.A03();
            try {
                Cursor A07 = A03.A02.A07("SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories  FROM deleted_chat_job WHERE _id=?", new String[]{String.valueOf(longExtra)});
                if (A07 != null) {
                    if (A07.moveToFirst()) {
                        C03870Hl A032 = c03710Gt.A03(A07);
                        A07.close();
                        A03.close();
                        if (A032 != null) {
                            AbstractC005302j abstractC005302j = A032.A07;
                            int hashCode = action.hashCode();
                            if (hashCode != 1096596436) {
                                if (hashCode == 1835767556 && action.equals("action_clear")) {
                                    if (A05(A032)) {
                                        this.A05.A07(A032);
                                        this.A04.A0h(abstractC005302j, false);
                                        C03340Fh c03340Fh = this.A03;
                                        if (abstractC005302j != null) {
                                            synchronized (c03340Fh.A00) {
                                                Iterator it = c03340Fh.A00.iterator();
                                                while (true) {
                                                    C0G5 c0g5 = (C0G5) it;
                                                    if (c0g5.hasNext()) {
                                                        ((C0GG) c0g5.next()).A04(abstractC005302j);
                                                    }
                                                }
                                            }
                                            return;
                                        }
                                        throw null;
                                    }
                                    return;
                                }
                            } else if (action.equals("action_delete")) {
                                if (A05(A032) && this.A02.A0G(abstractC005302j)) {
                                    this.A05.A07(A032);
                                    if (abstractC005302j instanceof AbstractC011205o) {
                                        C0C8 c0c8 = this.A06;
                                        AbstractC011205o abstractC011205o = (AbstractC011205o) abstractC005302j;
                                        C0CD A04 = c0c8.A05.A04();
                                        try {
                                            C03790Hb A00 = A04.A00();
                                            if (c0c8.A08.A0E()) {
                                                C0F3 c0f3 = c0c8.A08;
                                                StringBuilder sb2 = new StringBuilder("participant-user-store/updateGroupParticipants/deleteParticipants/");
                                                sb2.append(abstractC011205o);
                                                Log.i(sb2.toString());
                                                C0CD A042 = c0f3.A08.A04();
                                                A042.A02.A01("group_participant_user", "group_jid_row_id = ?", new String[]{String.valueOf(c0f3.A07.A02(abstractC011205o))});
                                                A042.close();
                                            }
                                            if (c0c8.A08 != null) {
                                                C0CD A043 = c0c8.A07.A08.A04();
                                                A043.A02.A01("group_participants", "gjid = ?", new String[]{abstractC011205o.getRawString()});
                                                A043.close();
                                                A00.A00();
                                                A00.close();
                                                A04.close();
                                            } else {
                                                throw null;
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                throw th;
                                            } catch (Throwable th2) {
                                                try {
                                                    A04.close();
                                                } catch (Throwable unused) {
                                                }
                                                throw th2;
                                            }
                                        }
                                    }
                                    this.A01.A0F(abstractC005302j);
                                    this.A03.A06(abstractC005302j);
                                    return;
                                }
                                return;
                            }
                            C000200d.A13("conversation-delete-service/handle-intent invalid action=", action);
                            return;
                        }
                        return;
                    }
                    A07.close();
                }
                A03.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    try {
                        A03.close();
                    } catch (Throwable unused2) {
                    }
                    throw th4;
                }
            }
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String action;
        StringBuilder sb = new StringBuilder("conversation-delete-service/startcommand intent=");
        sb.append(intent);
        Log.i(sb.toString());
        if (intent != null && (action = intent.getAction()) != null) {
            int hashCode = action.hashCode();
            if (hashCode == 1096596436 ? action.equals("action_delete") : !(hashCode != 1835767556 || !action.equals("action_clear"))) {
                try {
                    AbstractC005302j A01 = AbstractC005302j.A01(intent.getStringExtra("jid_to_delete"));
                    this.A0A.putIfAbsent(A01, new C2KL());
                    this.A08.AS1(new RunnableEBaseShape1S0200000_I0_1(this, A01, 37));
                    if (this.A0C.compareAndSet(3, 1) || Build.VERSION.SDK_INT >= 26) {
                        A04(getString(R.string.delete_wait_progress), "", 2, 0);
                    }
                } catch (C011305p e) {
                    StringBuilder sb2 = new StringBuilder("conversation-delete-service/start-command invalid jid, action=");
                    sb2.append(action);
                    Log.e(sb2.toString(), e);
                }
            } else {
                C000200d.A13("conversation-delete-service/start-command invalid action=", action);
            }
            return super.onStartCommand(intent, i, i2);
        }
        Log.e("conversation-delete-service/start-command invalid action is null");
        return super.onStartCommand(intent, i, i2);
    }
}
