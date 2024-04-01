package X;

import android.content.ContentValues;

/* renamed from: X.0IT  reason: invalid class name */
/* loaded from: classes.dex */
public class C0IT {
    public double A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0H;
    public long A0I;
    public long A0L;
    public long A0M;
    public AnonymousClass092 A0O;
    public AnonymousClass092 A0P;
    public String A0Q;
    public String A0R;
    public boolean A0S;
    public boolean A0T;
    public final AbstractC005302j A0U;
    public long A0K = -1;
    public long A0J = 1;
    public long A0E = 1;
    public long A0G = 1;
    public long A0F = 1;
    public long A09 = 1;
    public C0CM A0N = new C0CM(0, 0);

    public C0IT(AbstractC005302j abstractC005302j) {
        this.A0U = abstractC005302j;
    }

    public synchronized ContentValues A00() {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("archived", Boolean.valueOf(this.A0S));
        return contentValues;
    }

    public synchronized ContentValues A01() {
        ContentValues contentValues;
        contentValues = new ContentValues(1);
        contentValues.put("change_number_notified_message_id", Long.valueOf(this.A09));
        return contentValues;
    }

    public synchronized ContentValues A02() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        return contentValues;
    }

    public synchronized ContentValues A03() {
        ContentValues A0B;
        A0B = A0B();
        A0B.put("last_read_message_table_id", Long.valueOf(this.A0H));
        A0B.put("last_message_table_id", Long.valueOf(this.A0G));
        A0B.put("last_important_message_table_id", Long.valueOf(this.A0F));
        return A0B;
    }

    public synchronized ContentValues A04() {
        ContentValues contentValues;
        contentValues = new ContentValues(4);
        contentValues.put("message_table_id", Long.valueOf(this.A0J));
        contentValues.put("last_message_table_id", Long.valueOf(this.A0G));
        contentValues.put("mod_tag", Integer.valueOf(this.A08));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0L));
        contentValues.put("unseen_message_count", Integer.valueOf(this.A04));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A06));
        return contentValues;
    }

    public synchronized ContentValues A05() {
        ContentValues contentValues;
        contentValues = new ContentValues(7);
        contentValues.put("key_remote_jid", this.A0U.getRawString());
        contentValues.put("subject", this.A0R);
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A07));
        contentValues.put("change_number_notified_message_id", Long.valueOf(this.A09));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0L));
        contentValues.put("my_messages", (Integer) 1);
        return contentValues;
    }

    public synchronized ContentValues A06() {
        ContentValues contentValues;
        contentValues = new ContentValues();
        contentValues.put("ephemeral_expiration", Integer.valueOf(this.A0N.expiration));
        contentValues.put("ephemeral_setting_timestamp", Long.valueOf(this.A0N.ephemeralSettingTimestamp));
        return contentValues;
    }

    public synchronized ContentValues A07() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("gen", Double.valueOf(this.A00));
        return contentValues;
    }

    public synchronized ContentValues A08() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(this.A0I));
        return contentValues;
    }

    public synchronized ContentValues A09() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("show_group_description", Integer.valueOf(this.A0T ? 1 : 0));
        return contentValues;
    }

    public synchronized ContentValues A0A() {
        ContentValues contentValues;
        contentValues = new ContentValues(1);
        contentValues.put("my_messages", Integer.valueOf(this.A02));
        return contentValues;
    }

    public synchronized ContentValues A0B() {
        ContentValues contentValues;
        contentValues = new ContentValues(4);
        contentValues.put("unseen_message_count", Integer.valueOf(this.A04));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A05));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A06));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0M));
        return contentValues;
    }

    public synchronized ContentValues A0C() {
        ContentValues contentValues;
        contentValues = new ContentValues(2);
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A07));
        return contentValues;
    }

    public synchronized ContentValues A0D() {
        ContentValues contentValues;
        contentValues = new ContentValues(3);
        contentValues.put("mod_tag", Integer.valueOf(this.A08));
        return contentValues;
    }

    public synchronized ContentValues A0E(Long l) {
        ContentValues contentValues;
        contentValues = new ContentValues(3);
        if (l != null) {
            contentValues.put("creation", l);
        }
        contentValues.put("subject", this.A0R);
        return contentValues;
    }

    public synchronized ContentValues A0F(Long l) {
        ContentValues contentValues;
        contentValues = new ContentValues(22);
        contentValues.put("mod_tag", Integer.valueOf(this.A08));
        contentValues.put("message_table_id", Long.valueOf(this.A0J));
        contentValues.put("last_message_table_id", Long.valueOf(this.A0G));
        contentValues.put("last_read_message_table_id", Long.valueOf(this.A0H));
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(this.A0I));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0M));
        contentValues.put("unseen_message_count", Integer.valueOf(this.A04));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A05));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A06));
        contentValues.put("last_important_message_table_id", Long.valueOf(this.A0F));
        contentValues.put("show_group_description", Integer.valueOf(this.A0T ? 1 : 0));
        contentValues.put("ephemeral_expiration", Integer.valueOf(this.A0N.expiration));
        contentValues.put("ephemeral_setting_timestamp", Long.valueOf(this.A0N.ephemeralSettingTimestamp));
        contentValues.put("gen", Double.valueOf(this.A00));
        contentValues.put("subject", this.A0R);
        contentValues.put("archived", Integer.valueOf(this.A0S ? 1 : 0));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0L));
        contentValues.put("change_number_notified_message_id", Long.valueOf(this.A09));
        contentValues.put("my_messages", Integer.valueOf(this.A02));
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A07));
        if (l != null) {
            contentValues.put("creation", l);
        }
        return contentValues;
    }

    public synchronized ContentValues A0G(Long l) {
        ContentValues contentValues;
        contentValues = new ContentValues(24);
        contentValues.put("mod_tag", Integer.valueOf(this.A08));
        contentValues.put("display_message_row_id", Long.valueOf(this.A0J));
        contentValues.put("last_message_row_id", Long.valueOf(this.A0G));
        contentValues.put("last_read_message_row_id", Long.valueOf(this.A0H));
        contentValues.put("last_read_receipt_sent_message_row_id", Long.valueOf(this.A0I));
        contentValues.put("unseen_earliest_message_received_time", Long.valueOf(this.A0M));
        contentValues.put("unseen_message_count", Integer.valueOf(this.A04));
        contentValues.put("unseen_missed_calls_count", Integer.valueOf(this.A05));
        contentValues.put("unseen_row_count", Integer.valueOf(this.A06));
        contentValues.put("last_important_message_row_id", Long.valueOf(this.A0F));
        contentValues.put("show_group_description", Integer.valueOf(this.A0T ? 1 : 0));
        contentValues.put("ephemeral_expiration", Integer.valueOf(this.A0N.expiration));
        contentValues.put("ephemeral_setting_timestamp", Long.valueOf(this.A0N.ephemeralSettingTimestamp));
        contentValues.put("gen", Double.valueOf(this.A00));
        contentValues.put("subject", this.A0R);
        contentValues.put("archived", Integer.valueOf(this.A0S ? 1 : 0));
        contentValues.put("sort_timestamp", Long.valueOf(this.A0L));
        contentValues.put("change_number_notified_message_row_id", Long.valueOf(this.A09));
        contentValues.put("spam_detection", Integer.valueOf(this.A02));
        contentValues.put("plaintext_disabled", Integer.valueOf(this.A01));
        contentValues.put("vcard_ui_dismissed", Integer.valueOf(this.A07));
        if (l != null) {
            contentValues.put("created_timestamp", l);
        }
        contentValues.put("unseen_important_message_count", Integer.valueOf(this.A03));
        return contentValues;
    }

    public synchronized String A0H() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(this.A06);
        sb.append("/");
        sb.append(this.A04);
        sb.append("/");
        sb.append(this.A05);
        sb.append("/");
        sb.append(this.A0M);
        sb.append("/");
        sb.append(this.A03);
        return sb.toString();
    }

    public void A0I() {
        this.A0P = null;
        this.A0O = null;
        this.A0J = 1L;
        this.A0G = 1L;
        this.A0F = 1L;
        this.A0H = 1L;
        this.A0I = 1L;
        this.A0E = 1L;
        A0J(0, 0, 0, 0);
    }

    public synchronized boolean A0J(int i, int i2, int i3, int i4) {
        if (this.A04 == i && this.A05 == i2 && this.A06 == i3 && this.A03 == i4) {
            return false;
        }
        if (i <= 0) {
            this.A0M = 0L;
        }
        this.A04 = i;
        this.A03 = i4;
        this.A05 = i2;
        this.A06 = i3;
        return true;
    }
}
