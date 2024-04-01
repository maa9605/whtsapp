package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.26s */
/* loaded from: classes2.dex */
public class C464126s implements C0EK {
    public static volatile C464126s A08;
    public final AbstractC000600i A00;
    public final C41581uB A01;
    public final AnonymousClass012 A02;
    public final C0FF A03;
    public final C0ES A04;
    public final C0EE A05;
    public final C0EG A06;
    public final C0EJ A07;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{209};
    }

    public C464126s(AnonymousClass012 anonymousClass012, AbstractC000600i abstractC000600i, C0EG c0eg, C0ES c0es, C41581uB c41581uB, C0EE c0ee, C0EJ c0ej, C0FF c0ff) {
        this.A02 = anonymousClass012;
        this.A00 = abstractC000600i;
        this.A06 = c0eg;
        this.A04 = c0es;
        this.A01 = c41581uB;
        this.A05 = c0ee;
        this.A07 = c0ej;
        this.A03 = c0ff;
    }

    public final synchronized void A00(C04420Kc c04420Kc, boolean z, UserJid userJid, long j, C02590Ca c02590Ca) {
        long j2;
        Jid jid = c04420Kc.A01;
        C011005l A03 = C011005l.A03(C003101m.A04(jid));
        if (A03 != null) {
            long A07 = c02590Ca.A07("v_id", 0L);
            C0FF c0ff = this.A03;
            if (c0ff.A03()) {
                C0FG c0fg = c0ff.A01;
                Map map = c0fg.A03;
                synchronized (map) {
                    C05130Nl c05130Nl = (C05130Nl) map.get(A03);
                    if (c05130Nl == null) {
                        c05130Nl = c0fg.A00(A03);
                    }
                    j2 = c05130Nl.A00;
                }
                if (j2 > A07) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("GroupNotificationHandler/handleAnnouncement/old version, gjid=");
                    sb.append(A03);
                    sb.append("; version=");
                    sb.append(A07);
                    Log.w(sb.toString());
                    this.A06.A0L(c04420Kc);
                }
            }
            C0ES c0es = this.A04;
            StringBuilder sb2 = new StringBuilder("groupmgr/onGroupAnnouncementsToggled/");
            sb2.append(c04420Kc);
            sb2.append("/");
            sb2.append(z);
            Log.i(sb2.toString());
            C011005l A032 = C011005l.A03(C003101m.A04(jid));
            if (A032 != null) {
                C05W c05w = c0es.A08;
                C06C A082 = c05w.A08(A032);
                if (A082 != null) {
                    if (A082.A0Q != z) {
                        Log.i("groupmgr/onGroupAnnouncementsToggled/changed");
                        C06C A0A = c05w.A0A(A032);
                        if (A0A.A0Q != z) {
                            A0A.A0Q = z;
                            c05w.A05.A0N(A0A);
                            c05w.A03.A00(A0A);
                        }
                        C23Z c23z = c0es.A0V;
                        C04360Jw A072 = c0es.A0g.A07(c04420Kc, A032, j, z ? 31 : 32, null);
                        A072.A0d(userJid);
                        c23z.A02(A072, 3009);
                    } else {
                        Log.i("groupmgr/onGroupAnnouncementsToggled/did not change");
                        c0es.A0c.A0L(c04420Kc);
                    }
                } else {
                    Log.i("groupmgr/onGroupAnnouncementsToggled/new group");
                }
                if (c0ff.A03()) {
                    c0ff.A01.A01(A03, A07);
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public final void A01(Set set) {
        if (!this.A05.A04() || set.isEmpty()) {
            return;
        }
        this.A01.A02((UserJid[]) set.toArray(new UserJid[0]), 2);
    }

    /* JADX WARN: Finally extract failed */
    public final boolean A02(C011005l c011005l, C02590Ca c02590Ca) {
        long j;
        long longValue;
        long A07 = c02590Ca.A07("prev_v_id", 0L);
        long A072 = c02590Ca.A07("v_id", 0L);
        C0FF c0ff = this.A03;
        if (c0ff.A03()) {
            C0FG c0fg = c0ff.A01;
            Map map = c0fg.A04;
            synchronized (map) {
                if (map.containsKey(c011005l)) {
                    longValue = ((Long) map.get(c011005l)).longValue();
                } else {
                    String[] strArr = {Long.toString(c0fg.A00.A02(c011005l))};
                    C0CD A03 = c0fg.A01.A03();
                    try {
                        Cursor A073 = A03.A02.A07("SELECT participant_version FROM group_notification_version WHERE group_jid_row_id = ?", strArr);
                        if (A073 == null || !A073.moveToNext()) {
                            j = 0;
                        } else {
                            j = A073.getLong(A073.getColumnIndexOrThrow("participant_version"));
                        }
                        map.put(c011005l, Long.valueOf(j));
                        if (A073 != null) {
                            A073.close();
                        }
                        A03.close();
                        Object obj = map.get(c011005l);
                        if (obj == null) {
                            throw null;
                        }
                        longValue = ((Long) obj).longValue();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            try {
                                A03.close();
                            } catch (Throwable unused) {
                            }
                            throw th2;
                        }
                    }
                }
            }
            if (longValue != 0 && A07 != longValue && A072 != longValue) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1245:0x0f1d, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1252:0x0f33, code lost:
        if (r1.equals(r6.A01) == false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x00e3, code lost:
        if (r7.containsKey(r4.A03) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0359, code lost:
        if (r6 == false) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x036c, code lost:
        if (r39.containsKey(r6) != false) goto L243;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:930:0x0680 A[Catch: 05p -> 0x0785, TryCatch #17 {05p -> 0x0785, blocks: (B:794:0x01df, B:796:0x01e7, B:798:0x01eb, B:800:0x01f1, B:802:0x0209, B:803:0x020b, B:805:0x021b, B:806:0x021f, B:808:0x0227, B:809:0x0229, B:811:0x022f, B:812:0x0231, B:814:0x0237, B:815:0x0239, B:817:0x0255, B:818:0x0257, B:828:0x0289, B:831:0x0291, B:834:0x029b, B:837:0x02a7, B:839:0x034c, B:842:0x035c, B:844:0x0362, B:847:0x0370, B:849:0x03a2, B:852:0x03aa, B:856:0x03ba, B:858:0x03c0, B:862:0x03fa, B:881:0x04c0, B:883:0x04e2, B:884:0x0589, B:886:0x058f, B:888:0x05a3, B:890:0x05b1, B:928:0x0647, B:930:0x0680, B:935:0x06a5, B:937:0x06ad, B:939:0x06c9, B:941:0x06d2, B:946:0x06e0, B:949:0x06f4, B:952:0x0706, B:960:0x0739, B:961:0x074d, B:963:0x0757, B:964:0x0760, B:966:0x0766, B:967:0x076f, B:954:0x072a, B:968:0x0780, B:938:0x06c4, B:892:0x05d7, B:853:0x03b3, B:854:0x03b4, B:918:0x05fb, B:920:0x0603, B:922:0x061d, B:925:0x063e, B:926:0x0642, B:970:0x0782, B:972:0x0784, B:863:0x0405, B:880:0x04bd, B:864:0x0409, B:866:0x0411, B:876:0x0471, B:877:0x047d, B:879:0x04b0, B:897:0x05de, B:872:0x046c, B:875:0x0470, B:859:0x03df, B:861:0x03f7, B:860:0x03e5), top: B:1381:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:933:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:937:0x06ad A[Catch: 05p -> 0x0785, TryCatch #17 {05p -> 0x0785, blocks: (B:794:0x01df, B:796:0x01e7, B:798:0x01eb, B:800:0x01f1, B:802:0x0209, B:803:0x020b, B:805:0x021b, B:806:0x021f, B:808:0x0227, B:809:0x0229, B:811:0x022f, B:812:0x0231, B:814:0x0237, B:815:0x0239, B:817:0x0255, B:818:0x0257, B:828:0x0289, B:831:0x0291, B:834:0x029b, B:837:0x02a7, B:839:0x034c, B:842:0x035c, B:844:0x0362, B:847:0x0370, B:849:0x03a2, B:852:0x03aa, B:856:0x03ba, B:858:0x03c0, B:862:0x03fa, B:881:0x04c0, B:883:0x04e2, B:884:0x0589, B:886:0x058f, B:888:0x05a3, B:890:0x05b1, B:928:0x0647, B:930:0x0680, B:935:0x06a5, B:937:0x06ad, B:939:0x06c9, B:941:0x06d2, B:946:0x06e0, B:949:0x06f4, B:952:0x0706, B:960:0x0739, B:961:0x074d, B:963:0x0757, B:964:0x0760, B:966:0x0766, B:967:0x076f, B:954:0x072a, B:968:0x0780, B:938:0x06c4, B:892:0x05d7, B:853:0x03b3, B:854:0x03b4, B:918:0x05fb, B:920:0x0603, B:922:0x061d, B:925:0x063e, B:926:0x0642, B:970:0x0782, B:972:0x0784, B:863:0x0405, B:880:0x04bd, B:864:0x0409, B:866:0x0411, B:876:0x0471, B:877:0x047d, B:879:0x04b0, B:897:0x05de, B:872:0x046c, B:875:0x0470, B:859:0x03df, B:861:0x03f7, B:860:0x03e5), top: B:1381:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:941:0x06d2 A[Catch: 05p -> 0x0785, TryCatch #17 {05p -> 0x0785, blocks: (B:794:0x01df, B:796:0x01e7, B:798:0x01eb, B:800:0x01f1, B:802:0x0209, B:803:0x020b, B:805:0x021b, B:806:0x021f, B:808:0x0227, B:809:0x0229, B:811:0x022f, B:812:0x0231, B:814:0x0237, B:815:0x0239, B:817:0x0255, B:818:0x0257, B:828:0x0289, B:831:0x0291, B:834:0x029b, B:837:0x02a7, B:839:0x034c, B:842:0x035c, B:844:0x0362, B:847:0x0370, B:849:0x03a2, B:852:0x03aa, B:856:0x03ba, B:858:0x03c0, B:862:0x03fa, B:881:0x04c0, B:883:0x04e2, B:884:0x0589, B:886:0x058f, B:888:0x05a3, B:890:0x05b1, B:928:0x0647, B:930:0x0680, B:935:0x06a5, B:937:0x06ad, B:939:0x06c9, B:941:0x06d2, B:946:0x06e0, B:949:0x06f4, B:952:0x0706, B:960:0x0739, B:961:0x074d, B:963:0x0757, B:964:0x0760, B:966:0x0766, B:967:0x076f, B:954:0x072a, B:968:0x0780, B:938:0x06c4, B:892:0x05d7, B:853:0x03b3, B:854:0x03b4, B:918:0x05fb, B:920:0x0603, B:922:0x061d, B:925:0x063e, B:926:0x0642, B:970:0x0782, B:972:0x0784, B:863:0x0405, B:880:0x04bd, B:864:0x0409, B:866:0x0411, B:876:0x0471, B:877:0x047d, B:879:0x04b0, B:897:0x05de, B:872:0x046c, B:875:0x0470, B:859:0x03df, B:861:0x03f7, B:860:0x03e5), top: B:1381:0x01df }] */
    /* JADX WARN: Removed duplicated region for block: B:968:0x0780 A[Catch: 05p -> 0x0785, TryCatch #17 {05p -> 0x0785, blocks: (B:794:0x01df, B:796:0x01e7, B:798:0x01eb, B:800:0x01f1, B:802:0x0209, B:803:0x020b, B:805:0x021b, B:806:0x021f, B:808:0x0227, B:809:0x0229, B:811:0x022f, B:812:0x0231, B:814:0x0237, B:815:0x0239, B:817:0x0255, B:818:0x0257, B:828:0x0289, B:831:0x0291, B:834:0x029b, B:837:0x02a7, B:839:0x034c, B:842:0x035c, B:844:0x0362, B:847:0x0370, B:849:0x03a2, B:852:0x03aa, B:856:0x03ba, B:858:0x03c0, B:862:0x03fa, B:881:0x04c0, B:883:0x04e2, B:884:0x0589, B:886:0x058f, B:888:0x05a3, B:890:0x05b1, B:928:0x0647, B:930:0x0680, B:935:0x06a5, B:937:0x06ad, B:939:0x06c9, B:941:0x06d2, B:946:0x06e0, B:949:0x06f4, B:952:0x0706, B:960:0x0739, B:961:0x074d, B:963:0x0757, B:964:0x0760, B:966:0x0766, B:967:0x076f, B:954:0x072a, B:968:0x0780, B:938:0x06c4, B:892:0x05d7, B:853:0x03b3, B:854:0x03b4, B:918:0x05fb, B:920:0x0603, B:922:0x061d, B:925:0x063e, B:926:0x0642, B:970:0x0782, B:972:0x0784, B:863:0x0405, B:880:0x04bd, B:864:0x0409, B:866:0x0411, B:876:0x0471, B:877:0x047d, B:879:0x04b0, B:897:0x05de, B:872:0x046c, B:875:0x0470, B:859:0x03df, B:861:0x03f7, B:860:0x03e5), top: B:1381:0x01df }] */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r42v5 */
    @Override // X.C0EK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AEN(int r57, android.os.Message r58) {
        /*
            Method dump skipped, instructions count: 4378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C464126s.AEN(int, android.os.Message):boolean");
    }
}
