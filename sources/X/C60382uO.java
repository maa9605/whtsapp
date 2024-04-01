package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.2uO */
/* loaded from: classes2.dex */
public final class C60382uO {
    public final C48092Dt A00;

    public C60382uO(C48092Dt c48092Dt) {
        this.A00 = c48092Dt;
    }

    public static List A00(AnonymousClass092 anonymousClass092, AnonymousClass092 anonymousClass0922, Set set) {
        if (anonymousClass092 == anonymousClass0922) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (!set.contains("status") && anonymousClass092.A08 != anonymousClass0922.A08) {
            arrayList.add("status");
        }
        if (!set.contains("sendRetryReceipt") && anonymousClass092.A0i != anonymousClass0922.A0i) {
            arrayList.add("sendRetryReceipt");
        }
        if (!set.contains("retryCount") && anonymousClass092.A07 != anonymousClass0922.A07) {
            arrayList.add("retryCount");
        }
        if (!set.contains("encoding") && anonymousClass092.A01 != anonymousClass0922.A01) {
            arrayList.add("encoding");
        }
        if (!set.contains("timestamp") && anonymousClass092.A0E != anonymousClass0922.A0E) {
            arrayList.add("timestamp");
        }
        if (!set.contains("receivedIncomingTimestamp") && anonymousClass092.A0C != anonymousClass0922.A0C) {
            arrayList.add("receivedIncomingTimestamp");
        }
        if (!set.contains("origin") && anonymousClass092.A04 != anonymousClass0922.A04) {
            arrayList.add("origin");
        }
        if (!set.contains("forwardingScore") && anonymousClass092.A03 != anonymousClass0922.A03) {
            arrayList.add("forwardingScore");
        }
        if (!set.contains("media_wa_type") && anonymousClass092.A0m != anonymousClass0922.A0m) {
            arrayList.add("media_wa_type");
        }
        if (!set.contains("broadcast") && anonymousClass092.A0f != anonymousClass0922.A0f) {
            arrayList.add("broadcast");
        }
        if (!set.contains("recipient_count") && anonymousClass092.A06 != anonymousClass0922.A06) {
            arrayList.add("recipient_count");
        }
        if (!set.contains("server_receipt_timestamp") && anonymousClass092.A0D != anonymousClass0922.A0D) {
            arrayList.add("server_receipt_timestamp");
        }
        if (!set.contains("row_id") && anonymousClass092.A0p != anonymousClass0922.A0p) {
            arrayList.add("row_id");
        }
        if (!set.contains("sort_id") && anonymousClass092.A0q != anonymousClass0922.A0q) {
            arrayList.add("sort_id");
        }
        if (!set.contains("starred") && anonymousClass092.A0j != anonymousClass0922.A0j) {
            arrayList.add("starred");
        }
        if (!set.contains("quoted_row_id") && anonymousClass092.A0B != anonymousClass0922.A0B) {
            arrayList.add("quoted_row_id");
        }
        if (!set.contains("messageDecorator") && !AnonymousClass024.A0l(anonymousClass092.A0D(), anonymousClass0922.A0D())) {
            arrayList.add("messageDecorator");
        }
        if (!set.contains("origination_flags") && anonymousClass092.A07() != anonymousClass0922.A07()) {
            arrayList.add("origination_flags");
        }
        if (!set.contains("verified_level") && anonymousClass092.A0A != anonymousClass0922.A0A) {
            arrayList.add("verified_level");
        }
        if (!set.contains("verifiedNameInSync") && anonymousClass092.A0k != anonymousClass0922.A0k) {
            arrayList.add("verified_level");
        }
        if (!set.contains("privacy_mode") && anonymousClass092.A0O != anonymousClass0922.A0O) {
            arrayList.add("verified_level");
        }
        if (!set.contains("chat_active") && anonymousClass092.A0g != anonymousClass0922.A0g) {
            arrayList.add("chat_active");
        }
        if (!set.contains("edited_version") && anonymousClass092.A00 != anonymousClass0922.A00) {
            arrayList.add("edited_version");
        }
        set.contains("conversion_tuple_interaction_delay_in_sec");
        if (!set.contains("deleted") && anonymousClass092.A0r != anonymousClass0922.A0r) {
            arrayList.add("deleted");
        }
        if (!set.contains("storageType") && anonymousClass092.A09 != anonymousClass0922.A09) {
            arrayList.add("storageType");
        }
        if (!set.contains("expirationDuration") && anonymousClass092.A02 != anonymousClass0922.A02) {
            arrayList.add("expirationDuration");
        }
        if (!set.contains("isFromLegacyEphemeralClient") && anonymousClass092.A0h != anonymousClass0922.A0h) {
            arrayList.add("isFromLegacyEphemeralClient");
        }
        if (!set.contains("key") && !anonymousClass092.A0n.equals(anonymousClass0922.A0n)) {
            arrayList.add("key");
        }
        if (!set.contains("senderJid") && !AnonymousClass024.A0l(anonymousClass092.A0A(), anonymousClass0922.A0A())) {
            arrayList.add("senderJid");
        }
        if (!set.contains("entVerifiedNameOnPrivacyConflict") && anonymousClass092.A0Y != anonymousClass0922.A0Y) {
            arrayList.add("entVerifiedNameOnPrivacyConflict");
        }
        if ((!(anonymousClass092 instanceof C04300Jq) || (anonymousClass092 instanceof C04360Jw)) && !set.contains("participantList") && !AnonymousClass029.A1Y(anonymousClass092.A0P(), anonymousClass0922.A0P())) {
            anonymousClass092.A0P();
            anonymousClass0922.A0P();
            arrayList.add("participantList");
        }
        if (!set.contains("participant_hash") && !AnonymousClass024.A0k(anonymousClass092.A0a, anonymousClass0922.A0a)) {
            arrayList.add("participant_hash");
        }
        if (!set.contains("broadcastParticipantEphemeralSettings") && !AnonymousClass024.A0l(anonymousClass092.A0e, anonymousClass0922.A0e)) {
            arrayList.add("broadcastParticipantEphemeralSettings");
        }
        if (!set.contains("data") && !AnonymousClass024.A0k(anonymousClass092.A0G(), anonymousClass0922.A0G())) {
            arrayList.add("data");
        }
        if (!set.contains("dataBytes") && !Arrays.equals(anonymousClass092.A15(), anonymousClass0922.A15())) {
            arrayList.add("dataBytes");
        }
        if (!set.contains("from_name") && !AnonymousClass024.A0k(anonymousClass092.A0Z, anonymousClass0922.A0Z)) {
            arrayList.add("from_name");
        }
        if (!set.contains("web") && anonymousClass092.A0J != anonymousClass0922.A0J) {
            arrayList.add("web");
        }
        if (!set.contains("mentionedJids") && !AnonymousClass029.A1Y(anonymousClass092.A0c, anonymousClass0922.A0c)) {
            arrayList.add("mentionedJids");
        }
        if (!set.contains("offline") && !AnonymousClass024.A0l(anonymousClass092.A0P, anonymousClass0922.A0P)) {
            arrayList.add("offline");
        }
        if (!set.contains("quotedMessage") && !AnonymousClass024.A0l(anonymousClass092.A0C(), anonymousClass0922.A0C())) {
            arrayList.add("quotedMessage");
        }
        if (!set.contains("externalAdContentInfo") && !AnonymousClass024.A0l(anonymousClass092.A0H, anonymousClass0922.A0H)) {
            arrayList.add("externalAdContentInfo");
        }
        if (!set.contains("mmsThumbnailMetadata") && !AnonymousClass024.A0l(anonymousClass092.A0N, anonymousClass0922.A0N)) {
            arrayList.add("mmsThumbnailMetadata");
        }
        if (!set.contains("verified_name") && !AnonymousClass024.A0l(anonymousClass092.A0U, anonymousClass0922.A0U)) {
            arrayList.add("verified_name");
        }
        if (!set.contains("triggred_block_expiration_ts") && !AnonymousClass024.A0l(anonymousClass092.A0T, anonymousClass0922.A0T)) {
            arrayList.add("triggred_block_expiration_ts");
        }
        if (!set.contains("triggred_block_cooldown") && !AnonymousClass024.A0l(anonymousClass092.A0S, anonymousClass0922.A0S)) {
            arrayList.add("triggred_block_cooldown");
        }
        if (!set.contains("conversion_tuple_source") && !AnonymousClass024.A0k(anonymousClass092.A0W, anonymousClass0922.A0W)) {
            arrayList.add("conversion_tuple_source");
        }
        if (!set.contains("conversion_tuple_data") && !AnonymousClass024.A0k(anonymousClass092.A0V, anonymousClass0922.A0V)) {
            arrayList.add("conversion_tuple_data");
        }
        if (!set.contains("thumbnail") && !AnonymousClass024.A0l(anonymousClass092.A0E(), anonymousClass0922.A0E())) {
            arrayList.add("thumbnail");
        }
        if (!set.contains("payment_transaction_id") && !AnonymousClass024.A0k(anonymousClass092.A0b, anonymousClass0922.A0b)) {
            arrayList.add("payment_transaction_id");
        }
        if (!set.contains("paymentTransactionInfo") && !AnonymousClass024.A0l(anonymousClass092.A0F, anonymousClass0922.A0F)) {
            arrayList.add("paymentTransactionInfo");
        }
        if (!set.contains("backFillMessageKey") && !AnonymousClass024.A0l(anonymousClass092.A0I, anonymousClass0922.A0I)) {
            arrayList.add("backFillMessageKey");
        }
        if (!set.contains("ephemeralSettingTimestamp") && !AnonymousClass024.A0l(anonymousClass092.A0Q, anonymousClass0922.A0Q)) {
            arrayList.add("ephemeralSettingTimestamp");
        }
        if (!set.contains("expirationExpireTimestamp") && !AnonymousClass024.A0l(anonymousClass092.A0R, anonymousClass0922.A0R)) {
            arrayList.add("expirationExpireTimestamp");
        }
        return arrayList;
    }

    public static List A01(AbstractC04290Jp abstractC04290Jp, AbstractC04290Jp abstractC04290Jp2, Set set) {
        if (abstractC04290Jp == abstractC04290Jp2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A00(abstractC04290Jp, abstractC04290Jp2, set));
        if (!set.contains("isLegacy") && abstractC04290Jp.A00 != abstractC04290Jp2.A00) {
            arrayList.add("isLegacy");
        }
        if (!set.contains("isVideoCall") && !AnonymousClass024.A0k(abstractC04290Jp.A0J(), abstractC04290Jp2.A0J())) {
            arrayList.add("isVideoCall");
        }
        if (!set.contains("callLogs") && !AnonymousClass029.A1Y(abstractC04290Jp.A19(), abstractC04290Jp2.A19())) {
            arrayList.add("callLogs");
        }
        return arrayList;
    }

    public static List A02(C09E c09e, C09E c09e2, Set set) {
        if (c09e == c09e2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A04(c09e, c09e2, set));
        if (!set.contains("pageCount") && c09e.A00 != c09e2.A00) {
            arrayList.add("pageCount");
        }
        return arrayList;
    }

    public static List A03(C0KD c0kd, C0KD c0kd2, Set set) {
        if (c0kd == c0kd2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A00(c0kd, c0kd2, set));
        if (!set.contains("latitude") && Double.compare(c0kd.A00, c0kd2.A00) != 0) {
            arrayList.add("latitude");
        }
        if (!set.contains("longitude") && Double.compare(c0kd.A01, c0kd2.A01) != 0) {
            arrayList.add("longitude");
        }
        if (!set.contains("downloadStatus") && c0kd.A02 != c0kd2.A02) {
            arrayList.add("downloadStatus");
        }
        return arrayList;
    }

    public static List A04(AnonymousClass097 anonymousClass097, AnonymousClass097 anonymousClass0972, Set set) {
        if (anonymousClass097 == anonymousClass0972) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A00(anonymousClass097, anonymousClass0972, set));
        if (!set.contains("media_duration_seconds") && anonymousClass097.A00 != anonymousClass0972.A00) {
            arrayList.add("media_duration_seconds");
        }
        if (!set.contains("media_size") && anonymousClass097.A01 != anonymousClass0972.A01) {
            arrayList.add("media_size");
        }
        if (!set.contains("mediaDataV2") && !AnonymousClass024.A0l(anonymousClass097.A02, anonymousClass0972.A02)) {
            arrayList.add("mediaDataV2");
        }
        if (!set.contains("media_caption") && !AnonymousClass024.A0k(anonymousClass097.A1A(), anonymousClass0972.A1A())) {
            arrayList.add("media_caption");
        }
        if (!set.contains("media_enc_hash") && !AnonymousClass024.A0k(anonymousClass097.A05, anonymousClass0972.A05)) {
            arrayList.add("media_enc_hash");
        }
        if (!set.contains("media_hash") && !AnonymousClass024.A0k(anonymousClass097.A06, anonymousClass0972.A06)) {
            arrayList.add("media_hash");
        }
        if (!set.contains("media_mime_type") && !AnonymousClass024.A0k(anonymousClass097.A07, anonymousClass0972.A07)) {
            arrayList.add("media_mime_type");
        }
        if (!set.contains("media_name") && !AnonymousClass024.A0k(anonymousClass097.A1B(), anonymousClass0972.A1B())) {
            arrayList.add("media_name");
        }
        if (!set.contains("media_url") && !AnonymousClass024.A0k(anonymousClass097.A09, anonymousClass0972.A09)) {
            arrayList.add("media_url");
        }
        if (!set.contains("original_file_hash") && !AnonymousClass024.A0k(anonymousClass097.A0B, anonymousClass0972.A0B)) {
            arrayList.add("original_file_hash");
        }
        if (!set.contains("multicast_id") && !AnonymousClass024.A0k(anonymousClass097.A0A, anonymousClass0972.A0A)) {
            arrayList.add("multicast_id");
        }
        if (!set.contains("sidecar") && !AnonymousClass024.A0l(anonymousClass097.A18(), anonymousClass0972.A18())) {
            arrayList.add("sidecar");
        }
        return arrayList;
    }

    public static List A05(C0JU c0ju, C0JU c0ju2, Set set) {
        if (c0ju == c0ju2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A00(c0ju, c0ju2, set));
        if (!set.contains("recipient") && !AnonymousClass024.A0l(c0ju.A00, c0ju2.A00)) {
            arrayList.add("recipient");
        }
        if (!set.contains("receivedAck") && !AnonymousClass024.A0l(Boolean.valueOf(c0ju.A01), Boolean.valueOf(c0ju2.A01))) {
            arrayList.add("receivedAck");
        }
        return arrayList;
    }

    public static List A06(C0LP c0lp, C0LP c0lp2, Set set) {
        if (c0lp == c0lp2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A03(c0lp, c0lp2, set));
        if (!set.contains("placeName") && !AnonymousClass024.A0k(c0lp.A01, c0lp2.A01)) {
            arrayList.add("placeName");
        }
        if (!set.contains("address") && !AnonymousClass024.A0k(c0lp.A00, c0lp2.A00)) {
            arrayList.add("address");
        }
        if (!set.contains("url") && !AnonymousClass024.A0k(c0lp.A02, c0lp2.A02)) {
            arrayList.add("url");
        }
        return arrayList;
    }

    public static List A07(C04300Jq c04300Jq, C04300Jq c04300Jq2, Set set) {
        if (c04300Jq == c04300Jq2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A00(c04300Jq, c04300Jq2, set));
        if (!set.contains("action") && c04300Jq.A00 != c04300Jq2.A00) {
            arrayList.add("action");
        }
        return arrayList;
    }

    public static List A08(C04360Jw c04360Jw, C04360Jw c04360Jw2, Set set) {
        if (c04360Jw == c04360Jw2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A07(c04360Jw, c04360Jw2, set));
        if (!set.contains("isCurrentUserJoined") && c04360Jw.A00 != c04360Jw2.A00) {
            arrayList.add("isCurrentUserJoined");
        }
        if (!set.contains("groupParticipants") && !AnonymousClass024.A0l(c04360Jw.A02, c04360Jw2.A02)) {
            arrayList.add("groupParticipants");
        }
        return arrayList;
    }

    public static List A09(C04590La c04590La, C04590La c04590La2, Set set) {
        if (c04590La == c04590La2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A07(c04590La, c04590La2, set));
        if (!set.contains("senderUserJid") && !AnonymousClass024.A0l(c04590La.A01, c04590La2.A01)) {
            arrayList.add("senderUserJid");
        }
        if (!set.contains("receiverUserJid") && !AnonymousClass024.A0l(c04590La.A00, c04590La2.A00)) {
            arrayList.add("receiverUserJid");
        }
        if (!set.contains("amountWithSymbol") && !AnonymousClass024.A0k(c04590La.A03, c04590La2.A03)) {
            arrayList.add("amountWithSymbol");
        }
        if (!set.contains("referenceMsgKey") && !AnonymousClass024.A0l(c04590La.A02, c04590La2.A02)) {
            arrayList.add("referenceMsgKey");
        }
        return arrayList;
    }

    public static List A0A(C0JJ c0jj, C0JJ c0jj2, Set set) {
        byte[] A1D;
        byte[] A1D2;
        if (c0jj == c0jj2) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(A00(c0jj, c0jj2, set));
        if (!set.contains("previewType") && c0jj.A00 != c0jj2.A00) {
            arrayList.add("previewType");
        }
        if (!set.contains("description") && !AnonymousClass024.A0k(c0jj.A02, c0jj2.A02)) {
            arrayList.add("description");
        }
        if (!set.contains("pageTitle") && !AnonymousClass024.A0k(c0jj.A04, c0jj2.A04)) {
            arrayList.add("pageTitle");
        }
        if (!set.contains("url") && !AnonymousClass024.A0k(c0jj.A05, c0jj2.A05)) {
            arrayList.add("url");
        }
        if (!set.contains("textData") && !AnonymousClass024.A0l(c0jj.A01, c0jj2.A01)) {
            arrayList.add("textData");
        }
        if (!set.contains("thumbData") && (A1D = c0jj.A1D()) != (A1D2 = c0jj2.A1D()) && (A1D == null ? A1D2.length != 0 : A1D2 != null ? !Arrays.equals(A1D, A1D2) : A1D.length != 0)) {
            arrayList.add("thumbData");
        }
        if (!set.contains("mimeType") && !AnonymousClass024.A0k(c0jj.A03, c0jj2.A03)) {
            arrayList.add("mimeType");
        }
        return arrayList;
    }

    public static final void A0B(String str) {
        if (str == null) {
            throw new IllegalStateException();
        }
        throw new IllegalStateException(str);
    }

    public final void A0C(String str) {
        if (this.A00 == null) {
            throw null;
        }
        if (str == null) {
            str = "";
        }
        A0B(str);
        throw null;
    }

    public void A0D(String str, double d, double d2) {
        if (Double.compare(d, d2) != 0 && Math.abs(d - d2) > 1.0E-9d) {
            A0C(str);
            throw null;
        }
    }

    public void A0E(String str, long j, long j2) {
        if (j <= 0) {
            A0J(str, j2 <= 0);
        } else {
            A0F(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public void A0F(String str, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return;
            }
        } else if (obj.equals(obj2)) {
            return;
        }
        A0C(str);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1539:0x0765, code lost:
        if (r11.A09 != null) goto L464;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0G(java.lang.String r9, java.lang.Object r10, java.lang.Object r11, java.util.Set r12) {
        /*
            Method dump skipped, instructions count: 4599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60382uO.A0G(java.lang.String, java.lang.Object, java.lang.Object, java.util.Set):void");
    }

    public void A0H(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            A0J(str, TextUtils.isEmpty(str3));
        } else {
            A0F(str, str2, str3);
        }
    }

    public void A0I(String str, List list, List list2, Set set) {
        if (list == list2) {
            return;
        }
        if (list == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("expected list is null");
            A0B(sb.toString());
            throw null;
        } else if (list2 != null) {
            if (list.size() == list2.size()) {
                for (int i = 0; i < list.size(); i++) {
                    A0G(str, list.get(i), list2.get(i), set);
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("list sizes are different");
            A0B(sb2.toString());
            throw null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("actual list is null");
            A0B(sb3.toString());
            throw null;
        }
    }

    public void A0J(String str, boolean z) {
        if (z) {
            return;
        }
        A0B(str);
        throw null;
    }

    public void A0K(String str, byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2 || Arrays.equals(bArr, bArr2)) {
            return;
        }
        A0C(str);
        throw null;
    }
}
