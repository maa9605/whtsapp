package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0D6  reason: invalid class name */
/* loaded from: classes.dex */
public class C0D6 {
    public static Map A00;
    public static Map A01;
    public static String[] A02 = {null, null, null, "200", "400", "404", "500", "501", "502", "action", "add", "after", "archive", "author", "available", "battery", "before", "body", "broadcast", "chat", "clear", "code", "composing", "contacts", "count", "create", "debug", "delete", "demote", "duplicate", "encoding", "error", "false", "filehash", "from", "g.us", "group", "groups_v2", "height", "id", "image", "in", "index", "invis", "item", "jid", "kind", "last", "leave", "live", "log", "media", "message", "mimetype", "missing", "modify", "name", "notification", "notify", "out", "owner", "participant", "paused", "picture", "played", "presence", "preview", "promote", "query", "raw", "read", "receipt", "received", "recipient", "recording", "relay", "remove", "response", "resume", "retry", "s.whatsapp.net", "seconds", "set", "size", "status", "subject", "subscribe", "t", "text", "to", "true", "type", "unarchive", "unavailable", "url", "user", "value", "web", "width", "mute", "read_only", "admin", "creator", "short", "update", "powersave", "checksum", "epoch", "block", "previous", "409", "replaced", "reason", "spam", "modify_tag", "message_info", "delivery", "emoji", "title", "description", "canonical-url", "matched-text", "star", "unstar", "media_key", "filename", "identity", "unread", "page", "page_count", "search", "media_message", "security", "call_log", "profile", "ciphertext", "invite", "gif", "vcard", "frequent", "privacy", "blacklist", "whitelist", "verify", "location", "document", "elapsed", "revoke_invite", "expiration", "unsubscribe", "disable", "vname", "old_jid", "new_jid", "announcement", "locked", "prop", "label", "color", "call", "offer", "call-id", "quick_reply", "sticker", "pay_t", "accept", "reject", "sticker_pack", "invalid", "canceled", "missed", "connected", "result", "audio", "video", "recent"};

    public static int A00(int i, int i2) {
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int[] iArr = C0JR.A00;
            if (i3 < iArr.length) {
                if (iArr[i3] == i) {
                    i4 = i3;
                }
                if (iArr[i3] == i2) {
                    i5 = i3;
                }
                if (i4 != -1 && i5 != -1) {
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        if (i4 < i5) {
            return -1;
        }
        return i4 > i5 ? 1 : 0;
    }

    public static String A01(boolean z, int i, int i2) {
        try {
            if (z) {
                return C55132jv.A01[i - 236][i2];
            }
            return C55132jv.A00[i2];
        } catch (ArrayIndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder("Fail while trying to access WapDict, dictNum=");
            sb.append(i);
            sb.append(", dictIdx=");
            sb.append(i2);
            Log.e(sb.toString());
            throw e;
        }
    }

    public static synchronized void A02() {
        synchronized (C0D6.class) {
            if (A00 != null) {
                return;
            }
            HashMap hashMap = new HashMap();
            int i = 0;
            while (true) {
                String[] strArr = C55132jv.A00;
                if (i >= strArr.length) {
                    break;
                }
                String str = strArr[i];
                if (!TextUtils.isEmpty(str)) {
                    hashMap.put(str, new C467327z(false, 0, i));
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                String[][] strArr2 = C55132jv.A01;
                if (i2 >= strArr2.length) {
                    break;
                }
                String[] strArr3 = strArr2[i2];
                for (int i3 = 0; i3 < strArr3.length; i3++) {
                    String str2 = strArr3[i3];
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap.put(str2, new C467327z(true, i2 + 236, i3));
                    }
                }
                i2++;
            }
            HashMap hashMap2 = new HashMap();
            int i4 = 0;
            while (true) {
                String[] strArr4 = A02;
                if (i4 < strArr4.length) {
                    String str3 = strArr4[i4];
                    if (!TextUtils.isEmpty(str3)) {
                        hashMap2.put(str3, new C467327z(false, -1, i4));
                    }
                    i4++;
                } else {
                    A01 = hashMap2;
                    A00 = hashMap;
                    return;
                }
            }
        }
    }
}
