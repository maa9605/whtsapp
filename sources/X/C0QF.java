package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0QF  reason: invalid class name */
/* loaded from: classes.dex */
public class C0QF extends AbstractC05100Nh implements InterfaceC05660Pp {
    public final C05B A00;
    public final C013306k A01;
    public final C05C A02;
    public final C05L A03;

    @Override // X.AbstractC05100Nh
    public String A0B() {
        return "new_pay_transaction_ready";
    }

    @Override // X.AbstractC05100Nh
    public int A0R() {
        return 2048;
    }

    @Override // X.AbstractC05100Nh
    public String A0U() {
        return "SELECT pay_transactions.rowid AS _id, pay_transactions.key_remote_jid, (CASE WHEN pay_transactions.key_remote_jid IS NOT NULL THEN pay_transactions.key_id else NULL END) AS key_id,messages.rowid AS message_row_id, (CASE WHEN pay_transactions.key_remote_jid IS NULL THEN pay_transactions.key_id else NULL END) AS interop_id, id, pay_transactions.timestamp AS timestamp, pay_transactions.status AS status, error_code, sender, receiver, type, currency, amount_1000, credential_id, methods, bank_transaction_id, metadata, init_timestamp, request_key_id, country, version, future_data, service_id FROM pay_transactions LEFT JOIN messages ON pay_transactions.key_id = messages.key_id WHERE pay_transactions.rowid>? LIMIT ?";
    }

    @Override // X.AbstractC05100Nh
    public String A0V() {
        return "migration_pay_transaction_retry";
    }

    @Override // X.AbstractC05100Nh
    public String A0W() {
        return "migration_pay_transaction_index";
    }

    public C0QF(C05B c05b, C05C c05c, C05L c05l, C013306k c013306k, C05670Pr c05670Pr) {
        super("payment_transaction", 1, c05670Pr);
        this.A00 = c05b;
        this.A02 = c05c;
        this.A03 = c05l;
        this.A01 = c013306k;
    }

    @Override // X.AbstractC05100Nh
    public long A05() {
        return this.A09.A03();
    }

    @Override // X.AbstractC05100Nh
    public Pair A0T(Cursor cursor) {
        Jid nullable;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("message_row_id");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("key_remote_jid");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("key_id");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("interop_id");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("id");
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("status");
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("error_code");
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("sender");
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("receiver");
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("type");
        int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("currency");
        int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("amount_1000");
        int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("credential_id");
        int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("methods");
        int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("bank_transaction_id");
        int columnIndexOrThrow18 = cursor.getColumnIndexOrThrow("metadata");
        int columnIndexOrThrow19 = cursor.getColumnIndexOrThrow("init_timestamp");
        int columnIndexOrThrow20 = cursor.getColumnIndexOrThrow("request_key_id");
        int columnIndexOrThrow21 = cursor.getColumnIndexOrThrow("country");
        int columnIndexOrThrow22 = cursor.getColumnIndexOrThrow("version");
        int columnIndexOrThrow23 = cursor.getColumnIndexOrThrow("future_data");
        int columnIndexOrThrow24 = cursor.getColumnIndexOrThrow("service_id");
        int i = 0;
        long j = -1;
        while (cursor.moveToNext()) {
            C0CF A01 = this.A03.A01("INSERT INTO pay_transaction ( _id, message_row_id, remote_jid_row_id, key_id, interop_id, id, timestamp, status, error_code, sender_jid_row_id, receiver_jid_row_id, type, currency_code, amount_1000, credential_id, methods, bank_transaction_id, metadata, init_timestamp, request_key_id, country, version, future_data, service_id ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            j = cursor.getLong(columnIndexOrThrow);
            A01.A04(1, j);
            if (!cursor.isNull(columnIndexOrThrow2)) {
                A01.A04(2, cursor.getLong(columnIndexOrThrow2));
            }
            if (!cursor.isNull(columnIndexOrThrow3) && (nullable = Jid.getNullable(cursor.getString(columnIndexOrThrow3))) != null) {
                long A02 = this.A00.A02(nullable);
                if (A02 != -1) {
                    A01.A04(3, A02);
                }
            }
            String string = cursor.getString(columnIndexOrThrow4);
            if (string == null) {
                A01.A02(4);
            } else {
                A01.A05(4, string);
            }
            String string2 = cursor.getString(columnIndexOrThrow5);
            if (string2 == null) {
                A01.A02(5);
            } else {
                A01.A05(5, string2);
            }
            String string3 = cursor.getString(columnIndexOrThrow6);
            if (string3 == null) {
                A01.A02(6);
            } else {
                A01.A05(6, string3);
            }
            if (!cursor.isNull(columnIndexOrThrow7)) {
                A01.A04(7, cursor.getLong(columnIndexOrThrow7));
            }
            if (!cursor.isNull(columnIndexOrThrow8)) {
                A01.A04(8, cursor.getLong(columnIndexOrThrow8));
            }
            String string4 = cursor.getString(columnIndexOrThrow9);
            if (string4 == null) {
                A01.A02(9);
            } else {
                A01.A05(9, string4);
            }
            Jid nullable2 = Jid.getNullable(cursor.getString(columnIndexOrThrow10));
            if (nullable2 != null) {
                long A022 = this.A00.A02(nullable2);
                if (A022 != -1) {
                    A01.A04(10, A022);
                }
            }
            Jid nullable3 = Jid.getNullable(cursor.getString(columnIndexOrThrow11));
            if (nullable3 != null) {
                long A023 = this.A00.A02(nullable3);
                if (A023 != -1) {
                    A01.A04(11, A023);
                }
            }
            A01.A04(12, cursor.getLong(columnIndexOrThrow12));
            String string5 = cursor.getString(columnIndexOrThrow13);
            if (string5 == null) {
                A01.A02(13);
            } else {
                A01.A05(13, string5);
            }
            A01.A04(14, cursor.getLong(columnIndexOrThrow14));
            String string6 = cursor.getString(columnIndexOrThrow15);
            if (string6 == null) {
                A01.A02(15);
            } else {
                A01.A05(15, string6);
            }
            String string7 = cursor.getString(columnIndexOrThrow16);
            if (string7 == null) {
                A01.A02(16);
            } else {
                A01.A05(16, string7);
            }
            String string8 = cursor.getString(columnIndexOrThrow17);
            if (string8 == null) {
                A01.A02(17);
            } else {
                A01.A05(17, string8);
            }
            String string9 = cursor.getString(columnIndexOrThrow18);
            if (string9 == null) {
                A01.A02(18);
            } else {
                A01.A05(18, string9);
            }
            if (!cursor.isNull(columnIndexOrThrow19)) {
                A01.A04(19, cursor.getLong(columnIndexOrThrow19));
            }
            String string10 = cursor.getString(columnIndexOrThrow20);
            if (string10 == null) {
                A01.A02(20);
            } else {
                A01.A05(20, string10);
            }
            String string11 = cursor.getString(columnIndexOrThrow21);
            if (string11 == null) {
                A01.A02(21);
            } else {
                A01.A05(21, string11);
            }
            A01.A04(22, cursor.getLong(columnIndexOrThrow22));
            byte[] blob = cursor.getBlob(columnIndexOrThrow23);
            if (blob == null) {
                A01.A02(23);
            } else {
                A01.A00.bindBlob(23, blob);
            }
            A01.A04(24, cursor.getLong(columnIndexOrThrow24));
            A01.A01();
            i++;
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    @Override // X.AbstractC05100Nh
    public Set A0X() {
        HashSet hashSet = new HashSet();
        hashSet.add("migration_jid_store");
        hashSet.add("migration_chat_store");
        return hashSet;
    }

    @Override // X.AbstractC05100Nh
    public boolean A0b() {
        return this.A01.A0g();
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.InterfaceC05660Pp
    public void onRollback() {
        C000700j.A07(false);
        C0CD A04 = this.A05.A04();
        try {
            C03790Hb A00 = A04.A00();
            A04.A02.A01("pay_transaction", null, null);
            C05C c05c = this.A02;
            c05c.A03("new_pay_transaction_ready");
            c05c.A03("migration_pay_transaction_index");
            c05c.A03("migration_pay_transaction_retry");
            A00.A00();
            A00.close();
            A04.close();
            Log.i(C014406v.A01("PaymentTransactionDatabaseMigration", "PaymentTransactionStore/resetDatabaseMigrationForDebug/done"));
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
