package X;

import android.text.TextUtils;

/* renamed from: X.1R1  reason: invalid class name */
/* loaded from: classes.dex */
public class C1R1 {
    public static final String A01 = C000200d.A0M(C000200d.A0P("INSERT INTO wa_contacts SELECT "), TextUtils.join(", ", new String[]{"_id", "jid", "is_whatsapp_user", "status", "status_timestamp", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "unseen_msg_count", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name"}), " FROM ", "old_wa_contacts");
    public static final String A00 = C000200d.A0M(C000200d.A0P("INSERT INTO wa_contacts SELECT "), TextUtils.join(", ", new String[]{"_id", "jid", "is_whatsapp_user", "status", "status_timestamp", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "unseen_msg_count", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name", "nickname", "company", "title", "status_autodownload_disabled", "keep_timestamp", "is_spam_reported"}), " FROM ", "old_wa_contacts");
}
