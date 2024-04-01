package X;

import android.database.Cursor;
import android.database.SQLException;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Q2  reason: invalid class name */
/* loaded from: classes.dex */
public class C0Q2 extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C0Q1 A00;
    public final C05C A01;
    public final C06O A02;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "system_message_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_message_system_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_message_system_index";
    }

    public C0Q2(C05C c05c, C06O c06o, C0Q1 c0q1, C05670Pr c05670Pr) {
        super("message_system", 2, c05670Pr);
        this.A01 = c05c;
        this.A02 = c06o;
        this.A00 = c0q1;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        C04300Jq c04300Jq;
        AnonymousClass092 A02;
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            try {
                C0Q1 c0q1 = this.A00;
                String string = cursor.getString(cursor.getColumnIndexOrThrow("key_id"));
                boolean z = cursor.getInt(cursor.getColumnIndexOrThrow("key_from_me")) == 1;
                AbstractC005302j A022 = AbstractC005302j.A02(cursor.getString(cursor.getColumnIndexOrThrow("key_remote_jid")));
                if (A022 == null) {
                    A02 = null;
                } else {
                    AnonymousClass094 anonymousClass094 = new AnonymousClass094(A022, z, string);
                    int columnIndex = cursor.getColumnIndex("message_type");
                    if (columnIndex < 0) {
                        columnIndex = cursor.getColumnIndexOrThrow("media_wa_type");
                    }
                    byte b = (byte) cursor.getInt(columnIndex);
                    long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("timestamp"));
                    int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("status"));
                    byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("thumb_image"));
                    if (blob != null) {
                        try {
                            ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(blob));
                            try {
                                objectInputStream.readObject();
                                objectInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                    break;
                                } catch (Throwable th2) {
                                    try {
                                        objectInputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                    throw th2;
                                    break;
                                }
                            }
                        } catch (IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException e) {
                            Log.e("MessageStoreMessageUtils/readMessageFromCursor", e);
                        }
                    }
                    if (C0DB.A0F(b, i2)) {
                        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("media_size"));
                        if (i3 == 38) {
                            A02 = c0q1.A02.A02(anonymousClass094, j2, (byte) 33);
                        } else {
                            A02 = C07A.A00(anonymousClass094, j2, i3, c0q1.A00);
                        }
                    } else {
                        A02 = c0q1.A02.A02(anonymousClass094, j2, b);
                    }
                    A02.A0c(c0q1.A01, cursor);
                }
                c04300Jq = (C04300Jq) A02;
            } catch (SQLException e2) {
                throw e2;
            } catch (Exception e3) {
                c04300Jq = null;
                StringBuilder sb = new StringBuilder("MissedCallsLogDatabaseMigration/processBatch/failed to read message with id = ");
                sb.append(j);
                Log.e(sb.toString(), e3);
            }
            if (c04300Jq != null) {
                this.A02.A02(c04300Jq);
                i++;
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return AbstractC60072ts.A04;
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        hashSet.add("message_quoted");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A02.A03();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            C0CE c0ce = A04.A02;
            c0ce.A01("message_system", null, null);
            c0ce.A01("message_system_group", null, null);
            c0ce.A01("message_system_photo_change", null, null);
            c0ce.A01("message_system_number_change", null, null);
            c0ce.A01("message_system_device_change", null, null);
            c0ce.A01("message_system_initial_privacy_provider", null, null);
            c0ce.A01("message_system_value_change", null, null);
            c0ce.A01("message_system_chat_participant", null, null);
            c0ce.A01("message_payment", null, null);
            c0ce.A01("message_payment_status_update", null, null);
            c0ce.A01("message_system_block_contact", null, null);
            c0ce.A01("message_system_ephemeral_setting_not_applied", null, null);
            c0ce.A01("message_payment_transaction_reminder", null, null);
            c0ce.A01("message_system_payment_invite_setup", null, null);
            C05C c05c = this.A01;
            c05c.A03("system_message_ready");
            c05c.A03("migration_message_system_index");
            c05c.A03("migration_message_system_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i("SystemMessageStore/SystemMessageStoreDatabaseMigration/resetMigration/done");
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
}
