package com.whatsapp.jobqueue.job;

import X.AbstractC000600i;
import X.AbstractC005302j;
import X.AbstractC011205o;
import X.AnonymousClass012;
import X.AnonymousClass029;
import X.AnonymousClass092;
import X.AnonymousClass094;
import X.AnonymousClass295;
import X.C000200d;
import X.C001200o;
import X.C002501g;
import X.C002701i;
import X.C003101m;
import X.C010805j;
import X.C01J;
import X.C01R;
import X.C02L;
import X.C05G;
import X.C05Y;
import X.C0C5;
import X.C0C8;
import X.C0C9;
import X.C0CM;
import X.C0CT;
import X.C0DV;
import X.C0E3;
import X.C0E5;
import X.C0E8;
import X.C0E9;
import X.C0ED;
import X.C0EZ;
import X.C0Ho;
import X.C0I1;
import X.C0I7;
import X.C0IO;
import X.C0RN;
import X.C19950wX;
import X.C26S;
import X.C27391Ne;
import X.C2G4;
import X.C40531sQ;
import X.C40541sR;
import X.C41401tr;
import X.C41461tx;
import X.C41731uQ;
import X.C41901uh;
import X.C42041uv;
import X.C62372xn;
import X.EnumC03920Hs;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendE2EMessageJob;
import com.whatsapp.jobqueue.requirement.AxolotlDifferentAliceBaseKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement;
import com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement;
import com.whatsapp.jobqueue.requirement.ChatConnectionRequirement;
import com.whatsapp.service.UnsentMessagesNetworkAvailableJob;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* loaded from: classes2.dex */
public final class SendE2EMessageJob extends Job implements C0I7 {
    public static final ConcurrentHashMap A0X = new ConcurrentHashMap();
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient int A01;
    public transient long A02;
    public transient long A03;
    public transient long A04;
    public transient long A05;
    public transient AbstractC000600i A06;
    public transient C02L A07;
    public transient C0E3 A08;
    public transient C0E5 A09;
    public transient AnonymousClass012 A0A;
    public transient C01J A0B;
    public transient C01R A0C;
    public transient C0C9 A0D;
    public transient C0C8 A0E;
    public transient C0E8 A0F;
    public transient C0E9 A0G;
    public transient C41401tr A0H;
    public transient C0ED A0I;
    public transient DeviceJid A0J;
    public transient C41461tx A0K;
    public transient C05Y A0L;
    public transient C0DV A0M;
    public transient C40531sQ A0N;
    public transient C05G A0O;
    public transient C41901uh A0P;
    public transient C0EZ A0Q;
    public transient C26S A0R;
    public transient C41731uQ A0S;
    public transient boolean A0T;
    public transient boolean A0U;
    public transient boolean A0V;
    public transient boolean A0W;
    public final HashMap broadcastParticipantEphemeralSettings;
    public boolean duplicate;
    public final int editVersion;
    public final HashMap encryptionRetryCounts;
    public final byte[] ephemeralSharedSecret;
    public final long expireTimeMs;
    public final String groupParticipantHash;
    public String groupParticipantHashToSend;
    public final String id;
    public final boolean includeSenderKeysInMessage;
    public final String jid;
    public final Integer liveLocationDuration;
    public final boolean multiDeviceFanOut;
    public final long originalTimestamp;
    public final int originationFlags;
    public final String participant;
    public final String recipientRawJid;
    public final int retryCount;
    public final HashSet targetDeviceRawJids;
    public final boolean useOneOneEncryptionOnPHashMismatch;
    public final EnumC03920Hs webAttribute;

    /* JADX WARN: Code restructure failed: missing block: B:71:0x001a, code lost:
        if (r12 != null) goto L60;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SendE2EMessageJob(X.C40531sQ r9, java.lang.String r10, com.whatsapp.jid.Jid r11, com.whatsapp.jid.DeviceJid r12, com.whatsapp.jid.UserJid r13, java.util.Set r14, int r15, boolean r16, long r17, java.lang.String r19, java.lang.String r20, X.EnumC03920Hs r21, byte[] r22, boolean r23, long r24, long r26, int r28, int r29, java.lang.Integer r30, boolean r31, boolean r32, byte[] r33, java.util.Map r34, X.C26S r35) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.<init>(X.1sQ, java.lang.String, com.whatsapp.jid.Jid, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.util.Set, int, boolean, long, java.lang.String, java.lang.String, X.0Hs, byte[], boolean, long, long, int, int, java.lang.Integer, boolean, boolean, byte[], java.util.Map, X.26S):void");
    }

    public static final C40531sQ A00(C40531sQ c40531sQ, String str, String str2) {
        C0CT AVX = C2G4.A04.AVX();
        if (c40531sQ != null) {
            AVX.A02();
            C2G4 c2g4 = (C2G4) AVX.A00;
            c2g4.A01 = c40531sQ;
            c2g4.A00 |= 2;
        }
        if (str != null) {
            AVX.A02();
            C2G4 c2g42 = (C2G4) AVX.A00;
            c2g42.A00 |= 1;
            c2g42.A02 = str;
        }
        if (str2 != null) {
            AVX.A02();
            C2G4 c2g43 = (C2G4) AVX.A00;
            c2g43.A00 |= 4;
            c2g43.A03 = str2;
        }
        C40541sR A09 = C40531sQ.A09();
        A09.A02();
        C40531sQ c40531sQ2 = (C40531sQ) A09.A00;
        if (c40531sQ2 != null) {
            c40531sQ2.A0B = (C2G4) AVX.A01();
            c40531sQ2.A00 |= 33554432;
            return (C40531sQ) A09.A01();
        }
        throw null;
    }

    public static C010805j A01(C27391Ne c27391Ne) {
        if (c27391Ne.A01 == 0) {
            return new C010805j(2, C42041uv.A00(c27391Ne.A00), c27391Ne.A02);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Set] */
    @Override // org.whispersystems.jobqueue.Job
    public void A02() {
        ?? arrayList;
        StringBuilder A0P = C000200d.A0P("sende2emessagejob/e2e message send job added");
        A0P.append(A0D());
        Log.i(A0P.toString());
        if (this.duplicate) {
            StringBuilder A0P2 = C000200d.A0P("sende2emessagejob/e2e messasge job is duplicate, skipping requirement check");
            A0P2.append(A0D());
            Log.w(A0P2.toString());
            return;
        }
        this.A0V = true;
        DeviceJid deviceJid = null;
        for (Requirement requirement : this.parameters.requirements) {
            if (requirement instanceof AxolotlSessionRequirement) {
                AxolotlSessionRequirement axolotlSessionRequirement = (AxolotlSessionRequirement) requirement;
                if (!axolotlSessionRequirement.AFd()) {
                    deviceJid = axolotlSessionRequirement.A01;
                }
            } else if (requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) {
                AxolotlDifferentAliceBaseKeyRequirement axolotlDifferentAliceBaseKeyRequirement = (AxolotlDifferentAliceBaseKeyRequirement) requirement;
                if (!axolotlDifferentAliceBaseKeyRequirement.AFd()) {
                    deviceJid = axolotlDifferentAliceBaseKeyRequirement.A01;
                }
            } else if (requirement instanceof AxolotlMultiDeviceSessionRequirement) {
                AxolotlMultiDeviceSessionRequirement axolotlMultiDeviceSessionRequirement = (AxolotlMultiDeviceSessionRequirement) requirement;
                List<List> A00 = axolotlMultiDeviceSessionRequirement.A00();
                if (A00 == null) {
                    arrayList = Collections.emptySet();
                } else {
                    arrayList = new ArrayList();
                    for (List list : A00) {
                        Set<C0IO> A0H = axolotlMultiDeviceSessionRequirement.A01.A0H(list);
                        ArrayList arrayList2 = new ArrayList(A0H.size());
                        for (C0IO c0io : A0H) {
                            arrayList2.add(C002701i.A0X(c0io));
                        }
                        arrayList.addAll(arrayList2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.A0U = true;
                    this.A0V = false;
                    this.A04 = this.A0A.A04();
                    this.A00 = arrayList.size();
                    this.A09.A03((DeviceJid[]) arrayList.toArray(new DeviceJid[0]), false, 1);
                }
            } else if (requirement instanceof AxolotlFastRatchetSenderKeyRequirement) {
                if (!((AxolotlFastRatchetSenderKeyRequirement) requirement).AFd()) {
                    this.A0K.A0g();
                }
            } else if ((requirement instanceof ChatConnectionRequirement) && !((ChatConnectionRequirement) requirement).AFd()) {
                this.A0W = true;
                if (this.retryCount != 0) {
                    continue;
                } else {
                    C41901uh c41901uh = this.A0P;
                    if (c41901uh != null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            Log.i("Scheduling job for unsent messages");
                            C001200o c001200o = c41901uh.A00;
                            ((JobScheduler) c001200o.A00.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(6, new ComponentName(c001200o.A00, UnsentMessagesNetworkAvailableJob.class)).setRequiredNetworkType(1).setPersisted(true).build());
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
        if (deviceJid != null) {
            this.A0U = true;
            this.A0V = false;
            this.A04 = this.A0A.A04();
            this.A09.A03(new DeviceJid[]{deviceJid}, false, 1);
        }
        this.A09.A01();
    }

    @Override // org.whispersystems.jobqueue.Job
    public void A03() {
        StringBuilder A0P = C000200d.A0P("sende2emessagejob/e2e send job canceled");
        A0P.append(A0D());
        Log.w(A0P.toString());
        A0X.remove(new C62372xn(this.jid, this.id, this.editVersion, this.participant));
    }

    /* JADX WARN: Code restructure failed: missing block: B:664:0x02a4, code lost:
        if (r33 != null) goto L504;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1024:0x0a70 A[Catch: all -> 0x0a71, TRY_LEAVE, TryCatch #22 {all -> 0x0a78, blocks: (B:950:0x08c9, B:1012:0x0a5b, B:951:0x08cd, B:953:0x08d5, B:964:0x096e, B:968:0x0985, B:976:0x09a6, B:998:0x09c8, B:1011:0x0a55, B:1024:0x0a70, B:999:0x09f7, B:1010:0x0a52, B:1000:0x09fb, B:1001:0x0a11, B:1003:0x0a17, B:1004:0x0a29, B:1005:0x0a38, B:1007:0x0a3e, B:1009:0x0a4e, B:954:0x08ec, B:975:0x09a3, B:991:0x09be), top: B:1066:0x08c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:856:0x0669 A[Catch: all -> 0x0ac8, Exception -> 0x0adc, TryCatch #31 {all -> 0x0ac8, blocks: (B:576:0x0015, B:578:0x0019, B:581:0x0044, B:583:0x0052, B:585:0x0066, B:588:0x006f, B:590:0x0073, B:592:0x007d, B:598:0x009f, B:599:0x00a8, B:602:0x00b9, B:605:0x00e4, B:607:0x00f0, B:609:0x010a, B:613:0x0133, B:615:0x013f, B:618:0x016a, B:620:0x0187, B:623:0x01b2, B:625:0x01bc, B:627:0x01c4, B:631:0x01f2, B:633:0x0201, B:634:0x0205, B:640:0x021a, B:642:0x0235, B:644:0x023b, B:646:0x0243, B:648:0x0249, B:649:0x024d, B:651:0x0257, B:653:0x025f, B:655:0x0267, B:656:0x0270, B:661:0x029e, B:666:0x02a8, B:668:0x02ac, B:671:0x02b7, B:673:0x02bf, B:675:0x02c6, B:677:0x02cd, B:679:0x02d5, B:681:0x02df, B:683:0x02e3, B:695:0x0351, B:719:0x03aa, B:708:0x036a, B:709:0x036b, B:710:0x036c, B:711:0x0383, B:713:0x0389, B:715:0x0391, B:716:0x0397, B:718:0x03a6, B:717:0x039f, B:722:0x03b4, B:725:0x03ba, B:730:0x03c7, B:732:0x03ce, B:734:0x03d9, B:736:0x03df, B:738:0x03e5, B:740:0x03e9, B:742:0x03ed, B:743:0x03f0, B:744:0x03f9, B:746:0x03ff, B:748:0x0412, B:750:0x0424, B:751:0x0428, B:753:0x042e, B:754:0x0437, B:821:0x05b0, B:824:0x05cb, B:826:0x05ec, B:830:0x0607, B:832:0x060b, B:833:0x060f, B:835:0x0613, B:837:0x061d, B:839:0x062f, B:840:0x0633, B:842:0x0637, B:846:0x0646, B:850:0x0650, B:851:0x065e, B:857:0x0670, B:858:0x0676, B:860:0x069e, B:861:0x06df, B:862:0x071a, B:865:0x072a, B:870:0x0735, B:872:0x073f, B:873:0x0760, B:874:0x0768, B:877:0x0782, B:942:0x089f, B:943:0x08a2, B:947:0x08b0, B:949:0x08b6, B:1013:0x0a5e, B:1034:0x0a7e, B:1039:0x0aa9, B:1040:0x0aab, B:882:0x07ce, B:885:0x07d7, B:888:0x07e0, B:891:0x07e9, B:896:0x07f5, B:898:0x07ff, B:901:0x0811, B:905:0x0821, B:908:0x082b, B:910:0x0831, B:914:0x0841, B:916:0x0847, B:920:0x0857, B:922:0x085d, B:925:0x0867, B:927:0x086d, B:930:0x087b, B:933:0x0882, B:936:0x088c, B:939:0x0896, B:856:0x0669, B:1042:0x0aae, B:1044:0x0ab9, B:1045:0x0ac4, B:1046:0x0ac5, B:755:0x0438, B:757:0x0451, B:759:0x0455, B:761:0x045d, B:763:0x0463, B:765:0x0469, B:767:0x046d, B:769:0x0471, B:770:0x0474, B:772:0x047e, B:773:0x048d, B:775:0x0493, B:776:0x04a7, B:778:0x04b0, B:780:0x04ba, B:782:0x04c7, B:783:0x04cb, B:785:0x04d1, B:786:0x04f7, B:788:0x04fd, B:790:0x0505, B:793:0x050f, B:796:0x053e, B:798:0x0544, B:799:0x0548, B:801:0x054e, B:802:0x0560, B:803:0x0569, B:795:0x0536, B:804:0x056a, B:817:0x05a3, B:819:0x05a9, B:820:0x05ac, B:807:0x0573, B:811:0x057b, B:812:0x0583, B:813:0x0588, B:814:0x0589, B:815:0x059e, B:729:0x03c6, B:657:0x0271, B:659:0x0280, B:660:0x029a, B:639:0x0211, B:596:0x0096, B:597:0x0097, B:1048:0x0ac7), top: B:1077:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:860:0x069e A[Catch: all -> 0x0ac8, Exception -> 0x0adc, TryCatch #31 {all -> 0x0ac8, blocks: (B:576:0x0015, B:578:0x0019, B:581:0x0044, B:583:0x0052, B:585:0x0066, B:588:0x006f, B:590:0x0073, B:592:0x007d, B:598:0x009f, B:599:0x00a8, B:602:0x00b9, B:605:0x00e4, B:607:0x00f0, B:609:0x010a, B:613:0x0133, B:615:0x013f, B:618:0x016a, B:620:0x0187, B:623:0x01b2, B:625:0x01bc, B:627:0x01c4, B:631:0x01f2, B:633:0x0201, B:634:0x0205, B:640:0x021a, B:642:0x0235, B:644:0x023b, B:646:0x0243, B:648:0x0249, B:649:0x024d, B:651:0x0257, B:653:0x025f, B:655:0x0267, B:656:0x0270, B:661:0x029e, B:666:0x02a8, B:668:0x02ac, B:671:0x02b7, B:673:0x02bf, B:675:0x02c6, B:677:0x02cd, B:679:0x02d5, B:681:0x02df, B:683:0x02e3, B:695:0x0351, B:719:0x03aa, B:708:0x036a, B:709:0x036b, B:710:0x036c, B:711:0x0383, B:713:0x0389, B:715:0x0391, B:716:0x0397, B:718:0x03a6, B:717:0x039f, B:722:0x03b4, B:725:0x03ba, B:730:0x03c7, B:732:0x03ce, B:734:0x03d9, B:736:0x03df, B:738:0x03e5, B:740:0x03e9, B:742:0x03ed, B:743:0x03f0, B:744:0x03f9, B:746:0x03ff, B:748:0x0412, B:750:0x0424, B:751:0x0428, B:753:0x042e, B:754:0x0437, B:821:0x05b0, B:824:0x05cb, B:826:0x05ec, B:830:0x0607, B:832:0x060b, B:833:0x060f, B:835:0x0613, B:837:0x061d, B:839:0x062f, B:840:0x0633, B:842:0x0637, B:846:0x0646, B:850:0x0650, B:851:0x065e, B:857:0x0670, B:858:0x0676, B:860:0x069e, B:861:0x06df, B:862:0x071a, B:865:0x072a, B:870:0x0735, B:872:0x073f, B:873:0x0760, B:874:0x0768, B:877:0x0782, B:942:0x089f, B:943:0x08a2, B:947:0x08b0, B:949:0x08b6, B:1013:0x0a5e, B:1034:0x0a7e, B:1039:0x0aa9, B:1040:0x0aab, B:882:0x07ce, B:885:0x07d7, B:888:0x07e0, B:891:0x07e9, B:896:0x07f5, B:898:0x07ff, B:901:0x0811, B:905:0x0821, B:908:0x082b, B:910:0x0831, B:914:0x0841, B:916:0x0847, B:920:0x0857, B:922:0x085d, B:925:0x0867, B:927:0x086d, B:930:0x087b, B:933:0x0882, B:936:0x088c, B:939:0x0896, B:856:0x0669, B:1042:0x0aae, B:1044:0x0ab9, B:1045:0x0ac4, B:1046:0x0ac5, B:755:0x0438, B:757:0x0451, B:759:0x0455, B:761:0x045d, B:763:0x0463, B:765:0x0469, B:767:0x046d, B:769:0x0471, B:770:0x0474, B:772:0x047e, B:773:0x048d, B:775:0x0493, B:776:0x04a7, B:778:0x04b0, B:780:0x04ba, B:782:0x04c7, B:783:0x04cb, B:785:0x04d1, B:786:0x04f7, B:788:0x04fd, B:790:0x0505, B:793:0x050f, B:796:0x053e, B:798:0x0544, B:799:0x0548, B:801:0x054e, B:802:0x0560, B:803:0x0569, B:795:0x0536, B:804:0x056a, B:817:0x05a3, B:819:0x05a9, B:820:0x05ac, B:807:0x0573, B:811:0x057b, B:812:0x0583, B:813:0x0588, B:814:0x0589, B:815:0x059e, B:729:0x03c6, B:657:0x0271, B:659:0x0280, B:660:0x029a, B:639:0x0211, B:596:0x0096, B:597:0x0097, B:1048:0x0ac7), top: B:1077:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:864:0x0728 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:870:0x0735 A[Catch: all -> 0x0ac8, Exception -> 0x0adc, TRY_ENTER, TryCatch #31 {all -> 0x0ac8, blocks: (B:576:0x0015, B:578:0x0019, B:581:0x0044, B:583:0x0052, B:585:0x0066, B:588:0x006f, B:590:0x0073, B:592:0x007d, B:598:0x009f, B:599:0x00a8, B:602:0x00b9, B:605:0x00e4, B:607:0x00f0, B:609:0x010a, B:613:0x0133, B:615:0x013f, B:618:0x016a, B:620:0x0187, B:623:0x01b2, B:625:0x01bc, B:627:0x01c4, B:631:0x01f2, B:633:0x0201, B:634:0x0205, B:640:0x021a, B:642:0x0235, B:644:0x023b, B:646:0x0243, B:648:0x0249, B:649:0x024d, B:651:0x0257, B:653:0x025f, B:655:0x0267, B:656:0x0270, B:661:0x029e, B:666:0x02a8, B:668:0x02ac, B:671:0x02b7, B:673:0x02bf, B:675:0x02c6, B:677:0x02cd, B:679:0x02d5, B:681:0x02df, B:683:0x02e3, B:695:0x0351, B:719:0x03aa, B:708:0x036a, B:709:0x036b, B:710:0x036c, B:711:0x0383, B:713:0x0389, B:715:0x0391, B:716:0x0397, B:718:0x03a6, B:717:0x039f, B:722:0x03b4, B:725:0x03ba, B:730:0x03c7, B:732:0x03ce, B:734:0x03d9, B:736:0x03df, B:738:0x03e5, B:740:0x03e9, B:742:0x03ed, B:743:0x03f0, B:744:0x03f9, B:746:0x03ff, B:748:0x0412, B:750:0x0424, B:751:0x0428, B:753:0x042e, B:754:0x0437, B:821:0x05b0, B:824:0x05cb, B:826:0x05ec, B:830:0x0607, B:832:0x060b, B:833:0x060f, B:835:0x0613, B:837:0x061d, B:839:0x062f, B:840:0x0633, B:842:0x0637, B:846:0x0646, B:850:0x0650, B:851:0x065e, B:857:0x0670, B:858:0x0676, B:860:0x069e, B:861:0x06df, B:862:0x071a, B:865:0x072a, B:870:0x0735, B:872:0x073f, B:873:0x0760, B:874:0x0768, B:877:0x0782, B:942:0x089f, B:943:0x08a2, B:947:0x08b0, B:949:0x08b6, B:1013:0x0a5e, B:1034:0x0a7e, B:1039:0x0aa9, B:1040:0x0aab, B:882:0x07ce, B:885:0x07d7, B:888:0x07e0, B:891:0x07e9, B:896:0x07f5, B:898:0x07ff, B:901:0x0811, B:905:0x0821, B:908:0x082b, B:910:0x0831, B:914:0x0841, B:916:0x0847, B:920:0x0857, B:922:0x085d, B:925:0x0867, B:927:0x086d, B:930:0x087b, B:933:0x0882, B:936:0x088c, B:939:0x0896, B:856:0x0669, B:1042:0x0aae, B:1044:0x0ab9, B:1045:0x0ac4, B:1046:0x0ac5, B:755:0x0438, B:757:0x0451, B:759:0x0455, B:761:0x045d, B:763:0x0463, B:765:0x0469, B:767:0x046d, B:769:0x0471, B:770:0x0474, B:772:0x047e, B:773:0x048d, B:775:0x0493, B:776:0x04a7, B:778:0x04b0, B:780:0x04ba, B:782:0x04c7, B:783:0x04cb, B:785:0x04d1, B:786:0x04f7, B:788:0x04fd, B:790:0x0505, B:793:0x050f, B:796:0x053e, B:798:0x0544, B:799:0x0548, B:801:0x054e, B:802:0x0560, B:803:0x0569, B:795:0x0536, B:804:0x056a, B:817:0x05a3, B:819:0x05a9, B:820:0x05ac, B:807:0x0573, B:811:0x057b, B:812:0x0583, B:813:0x0588, B:814:0x0589, B:815:0x059e, B:729:0x03c6, B:657:0x0271, B:659:0x0280, B:660:0x029a, B:639:0x0211, B:596:0x0096, B:597:0x0097, B:1048:0x0ac7), top: B:1077:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:873:0x0760 A[Catch: all -> 0x0ac8, Exception -> 0x0adc, TryCatch #31 {all -> 0x0ac8, blocks: (B:576:0x0015, B:578:0x0019, B:581:0x0044, B:583:0x0052, B:585:0x0066, B:588:0x006f, B:590:0x0073, B:592:0x007d, B:598:0x009f, B:599:0x00a8, B:602:0x00b9, B:605:0x00e4, B:607:0x00f0, B:609:0x010a, B:613:0x0133, B:615:0x013f, B:618:0x016a, B:620:0x0187, B:623:0x01b2, B:625:0x01bc, B:627:0x01c4, B:631:0x01f2, B:633:0x0201, B:634:0x0205, B:640:0x021a, B:642:0x0235, B:644:0x023b, B:646:0x0243, B:648:0x0249, B:649:0x024d, B:651:0x0257, B:653:0x025f, B:655:0x0267, B:656:0x0270, B:661:0x029e, B:666:0x02a8, B:668:0x02ac, B:671:0x02b7, B:673:0x02bf, B:675:0x02c6, B:677:0x02cd, B:679:0x02d5, B:681:0x02df, B:683:0x02e3, B:695:0x0351, B:719:0x03aa, B:708:0x036a, B:709:0x036b, B:710:0x036c, B:711:0x0383, B:713:0x0389, B:715:0x0391, B:716:0x0397, B:718:0x03a6, B:717:0x039f, B:722:0x03b4, B:725:0x03ba, B:730:0x03c7, B:732:0x03ce, B:734:0x03d9, B:736:0x03df, B:738:0x03e5, B:740:0x03e9, B:742:0x03ed, B:743:0x03f0, B:744:0x03f9, B:746:0x03ff, B:748:0x0412, B:750:0x0424, B:751:0x0428, B:753:0x042e, B:754:0x0437, B:821:0x05b0, B:824:0x05cb, B:826:0x05ec, B:830:0x0607, B:832:0x060b, B:833:0x060f, B:835:0x0613, B:837:0x061d, B:839:0x062f, B:840:0x0633, B:842:0x0637, B:846:0x0646, B:850:0x0650, B:851:0x065e, B:857:0x0670, B:858:0x0676, B:860:0x069e, B:861:0x06df, B:862:0x071a, B:865:0x072a, B:870:0x0735, B:872:0x073f, B:873:0x0760, B:874:0x0768, B:877:0x0782, B:942:0x089f, B:943:0x08a2, B:947:0x08b0, B:949:0x08b6, B:1013:0x0a5e, B:1034:0x0a7e, B:1039:0x0aa9, B:1040:0x0aab, B:882:0x07ce, B:885:0x07d7, B:888:0x07e0, B:891:0x07e9, B:896:0x07f5, B:898:0x07ff, B:901:0x0811, B:905:0x0821, B:908:0x082b, B:910:0x0831, B:914:0x0841, B:916:0x0847, B:920:0x0857, B:922:0x085d, B:925:0x0867, B:927:0x086d, B:930:0x087b, B:933:0x0882, B:936:0x088c, B:939:0x0896, B:856:0x0669, B:1042:0x0aae, B:1044:0x0ab9, B:1045:0x0ac4, B:1046:0x0ac5, B:755:0x0438, B:757:0x0451, B:759:0x0455, B:761:0x045d, B:763:0x0463, B:765:0x0469, B:767:0x046d, B:769:0x0471, B:770:0x0474, B:772:0x047e, B:773:0x048d, B:775:0x0493, B:776:0x04a7, B:778:0x04b0, B:780:0x04ba, B:782:0x04c7, B:783:0x04cb, B:785:0x04d1, B:786:0x04f7, B:788:0x04fd, B:790:0x0505, B:793:0x050f, B:796:0x053e, B:798:0x0544, B:799:0x0548, B:801:0x054e, B:802:0x0560, B:803:0x0569, B:795:0x0536, B:804:0x056a, B:817:0x05a3, B:819:0x05a9, B:820:0x05ac, B:807:0x0573, B:811:0x057b, B:812:0x0583, B:813:0x0588, B:814:0x0589, B:815:0x059e, B:729:0x03c6, B:657:0x0271, B:659:0x0280, B:660:0x029a, B:639:0x0211, B:596:0x0096, B:597:0x0097, B:1048:0x0ac7), top: B:1077:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:876:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x08ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:953:0x08d5 A[Catch: all -> 0x0a71, TRY_LEAVE, TryCatch #22 {all -> 0x0a78, blocks: (B:950:0x08c9, B:1012:0x0a5b, B:951:0x08cd, B:953:0x08d5, B:964:0x096e, B:968:0x0985, B:976:0x09a6, B:998:0x09c8, B:1011:0x0a55, B:1024:0x0a70, B:999:0x09f7, B:1010:0x0a52, B:1000:0x09fb, B:1001:0x0a11, B:1003:0x0a17, B:1004:0x0a29, B:1005:0x0a38, B:1007:0x0a3e, B:1009:0x0a4e, B:954:0x08ec, B:975:0x09a3, B:991:0x09be), top: B:1066:0x08c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:998:0x09c8 A[Catch: all -> 0x0a71, TRY_LEAVE, TryCatch #22 {all -> 0x0a78, blocks: (B:950:0x08c9, B:1012:0x0a5b, B:951:0x08cd, B:953:0x08d5, B:964:0x096e, B:968:0x0985, B:976:0x09a6, B:998:0x09c8, B:1011:0x0a55, B:1024:0x0a70, B:999:0x09f7, B:1010:0x0a52, B:1000:0x09fb, B:1001:0x0a11, B:1003:0x0a17, B:1004:0x0a29, B:1005:0x0a38, B:1007:0x0a3e, B:1009:0x0a4e, B:954:0x08ec, B:975:0x09a3, B:991:0x09be), top: B:1066:0x08c9 }] */
    /* JADX WARN: Type inference failed for: r71v0, types: [com.whatsapp.jobqueue.job.SendE2EMessageJob, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map] */
    @Override // org.whispersystems.jobqueue.Job
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04() {
        /*
            Method dump skipped, instructions count: 2784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A04():void");
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A05() {
        if (this.A0A.A05() >= this.expireTimeMs) {
            return true;
        }
        boolean z = true;
        for (Requirement requirement : this.parameters.requirements) {
            if (!requirement.AFd()) {
                if (requirement instanceof ChatConnectionRequirement) {
                    this.A0W = true;
                }
                z = false;
            }
            if (!this.A0T && !this.A0V && ((requirement instanceof AxolotlSessionRequirement) || (requirement instanceof AxolotlDifferentAliceBaseKeyRequirement) || (requirement instanceof AxolotlMultiDeviceSessionRequirement))) {
                if (requirement.AFd()) {
                    this.A0V = true;
                    AnonymousClass012 anonymousClass012 = this.A0A;
                    this.A03 = anonymousClass012.A04();
                    this.A02 = anonymousClass012.A05();
                }
            }
        }
        return z;
    }

    @Override // org.whispersystems.jobqueue.Job
    public boolean A06(Exception exc) {
        StringBuilder A0P = C000200d.A0P("sende2emessagejob/exception while sending e2e message");
        A0P.append(A0D());
        Log.w(A0P.toString(), exc);
        if (exc instanceof EncryptionFailException) {
            EncryptionFailException encryptionFailException = (EncryptionFailException) exc;
            if (encryptionFailException.encryptionRetryCount > 3) {
                StringBuilder A0P2 = C000200d.A0P("sende2emessagejob/encryption failure limit reached for ");
                A0P2.append(encryptionFailException.jid);
                Log.w(A0P2.toString());
                return false;
            }
            StringBuilder A0P3 = C000200d.A0P("sende2emessagejob/retrying job due to encryption failure for ");
            A0P3.append(encryptionFailException.jid);
            A0P3.append("; encRetryCount ");
            C000200d.A1G(A0P3, encryptionFailException.encryptionRetryCount);
        }
        return !(exc instanceof UnrecoverableErrorException);
    }

    public final synchronized int A07(DeviceJid deviceJid) {
        int A08;
        A08 = A08(deviceJid) + 1;
        this.encryptionRetryCounts.put(deviceJid.getRawString(), Integer.valueOf(A08));
        return A08;
    }

    public final synchronized int A08(DeviceJid deviceJid) {
        String rawString = deviceJid.getRawString();
        if (this.encryptionRetryCounts.containsKey(rawString)) {
            return ((Integer) this.encryptionRetryCounts.get(rawString)).intValue();
        }
        return 0;
    }

    public final C27391Ne A09(DeviceJid deviceJid, C40531sQ c40531sQ, AnonymousClass092 anonymousClass092) {
        C27391Ne A07 = this.A0B.A07(C002701i.A0T(deviceJid), c40531sQ.A0B());
        this.A08.A0F(anonymousClass092, A07, Jid.getNullable(this.jid), deviceJid, this.retryCount, A07.A01 == 0 ? 0 : A08(deviceJid) + 1);
        return A07;
    }

    public final C40531sQ A0A(UserJid userJid, C40531sQ c40531sQ) {
        AnonymousClass295 A04 = this.A0H.A04(userJid);
        if (A04 != null) {
            C40541sR c40541sR = (C40541sR) C40531sQ.A0c.AVX();
            c40541sR.A02();
            c40541sR.A00.A0G(C0RN.A00, c40531sQ);
            C0Ho.A0G(c40541sR, A04);
            return (C40531sQ) c40541sR.A01();
        }
        return c40531sQ;
    }

    public final C40531sQ A0B(AnonymousClass094 anonymousClass094, DeviceJid deviceJid, C40531sQ c40531sQ) {
        String str;
        if (this.A07.A0A(deviceJid.userJid)) {
            AbstractC005302j abstractC005302j = anonymousClass094.A00;
            String str2 = !TextUtils.isEmpty(this.recipientRawJid) ? this.recipientRawJid : this.jid;
            if (C003101m.A0Q(abstractC005302j)) {
                str = A0E(this.A0G.A04(anonymousClass094));
            } else {
                str = null;
            }
            return A00(c40531sQ, str2, str);
        }
        return c40531sQ;
    }

    public final C010805j A0C(final DeviceJid deviceJid, final C40531sQ c40531sQ, final AnonymousClass092 anonymousClass092) {
        C01R c01r = this.A0C;
        return (C010805j) c01r.A00.submit(new Callable() { // from class: X.2xe
            {
                SendE2EMessageJob.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SendE2EMessageJob.A01(SendE2EMessageJob.this.A09(deviceJid, c40531sQ, anonymousClass092));
            }
        }).get();
    }

    public final String A0D() {
        String A0A = C003101m.A0A(this.jid);
        String A0A2 = C003101m.A0A(this.participant);
        StringBuilder A0P = C000200d.A0P("; id=");
        C000200d.A1U(A0P, this.id, "; jid=", A0A, "; participant=");
        A0P.append(A0A2);
        A0P.append("; retryCount=");
        A0P.append(this.retryCount);
        A0P.append("; groupParticipantHash=");
        A0P.append(this.groupParticipantHash);
        A0P.append("; groupParticipantHashToSend=");
        A0P.append(this.groupParticipantHashToSend);
        A0P.append("; webAttribute=");
        A0P.append(this.webAttribute);
        A0P.append("; includeSenderKeysInMessage=");
        A0P.append(this.includeSenderKeysInMessage);
        A0P.append("; useOneOneEncryptionOnPHashMismatch=");
        A0P.append(this.useOneOneEncryptionOnPHashMismatch);
        A0P.append("; persistentId=");
        A0P.append(super.A01);
        return A0P.toString();
    }

    public final String A0E(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid userJid = ((DeviceJid) it.next()).userJid;
            if (!this.A07.A0A(userJid)) {
                hashSet.add(userJid.getPrimaryDevice());
            }
        }
        return C002501g.A0F(hashSet);
    }

    public final Collection A0F(AnonymousClass094 anonymousClass094) {
        Set A04;
        if (A0L()) {
            HashSet hashSet = this.targetDeviceRawJids;
            A04 = new HashSet();
            C003101m.A0M(DeviceJid.class, hashSet, A04);
        } else {
            A04 = this.A0G.A04(anonymousClass094);
        }
        if (A0L()) {
            C0E8 c0e8 = this.A0F;
            if (c0e8 != null) {
                if (!A04.isEmpty()) {
                    A04.retainAll(c0e8.A03.A04(anonymousClass094));
                }
                return A04;
            }
            throw null;
        }
        return A04;
    }

    public final List A0G(AbstractC011205o abstractC011205o, Collection collection, Map map) {
        if (C003101m.A0P(abstractC011205o)) {
            TreeSet treeSet = new TreeSet();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid = (DeviceJid) it.next();
                if (map == null || !map.containsKey(deviceJid)) {
                    UserJid userJid = deviceJid.userJid;
                    if (!this.A07.A0A(userJid)) {
                        treeSet.add(userJid.getPrimaryDevice());
                    }
                }
            }
            return new ArrayList(treeSet);
        }
        return null;
    }

    public final Map A0H(Collection collection, Set set, AnonymousClass092 anonymousClass092) {
        Iterator it = collection.iterator();
        TreeMap treeMap = null;
        C40531sQ c40531sQ = null;
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (this.A07.A09(deviceJid) && !set.contains(deviceJid)) {
                if (treeMap == null) {
                    treeMap = new TreeMap();
                }
                if (c40531sQ == null) {
                    c40531sQ = A00(null, null, A0E(collection));
                }
                C010805j A0C = A0C(deviceJid, c40531sQ, anonymousClass092);
                if (A0C != null) {
                    treeMap.put(deviceJid, A0C);
                } else {
                    Log.e("sende2emessagejob/failed to encrypt dsm for peer");
                }
            }
        }
        return treeMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0005, code lost:
        if (r9 != null) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0I(com.whatsapp.jid.Jid r8, com.whatsapp.jid.DeviceJid r9) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.A0I(com.whatsapp.jid.Jid, com.whatsapp.jid.DeviceJid):void");
    }

    public void A0J(AnonymousClass092 anonymousClass092, int i, int i2) {
        long j;
        if (anonymousClass092 == null || anonymousClass092.A0E == 0 || this.A05 == 0) {
            return;
        }
        long A05 = this.A0A.A05() - anonymousClass092.A0E;
        AnonymousClass012 anonymousClass012 = this.A0A;
        long A04 = anonymousClass012.A04();
        long A052 = anonymousClass012.A05();
        if (i == 6) {
            j = this.A05;
        } else {
            j = anonymousClass092.A0u;
        }
        this.A08.A0E(anonymousClass092, i, this.retryCount, this.A0W, this.A0U, this.A00, this.A01, this.A0T, 0, 0, i2, A04 - j, A052 - anonymousClass092.A0E, A05);
    }

    public final void A0K(Map map, Collection collection) {
        C02L c02l = this.A07;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            C0I1 A03 = C0I1.A03(this.jid);
            if (A03 != null) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    DeviceJid deviceJid = (DeviceJid) it.next();
                    if (!map.containsKey(deviceJid)) {
                        Object obj = null;
                        if (!this.A07.A09(deviceJid)) {
                            UserJid userJid2 = deviceJid.userJid;
                            C0CM c0cm = (C0CM) this.broadcastParticipantEphemeralSettings.get(userJid2.getPrimaryDevice().getRawString());
                            if (c0cm != null) {
                                C41731uQ c41731uQ = this.A0S;
                                byte[] bArr = this.ephemeralSharedSecret;
                                if (c41731uQ != null) {
                                    C19950wX c19950wX = new C19950wX(c0cm.expiration, c0cm.ephemeralSettingTimestamp / 1000);
                                    JniBridge jniBridge = c41731uQ.A00;
                                    String rawString = userJid2.getRawString();
                                    String rawString2 = A03.getRawString();
                                    String rawString3 = userJid.getRawString();
                                    if (jniBridge != null) {
                                        obj = JniBridge.jvidispatchOOOOOOO(0, rawString, rawString2, rawString3, null, c19950wX.A00, bArr);
                                        if (obj == null) {
                                            Log.e("sende2emessagejob/failed to encrypt broadcast setting");
                                            throw new EncryptionFailException(deviceJid, A07(deviceJid));
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            } else {
                                Log.e("sende2emessagejob/missing broadcast setting");
                                throw new UnrecoverableErrorException(deviceJid);
                            }
                        }
                        map.put(deviceJid, obj);
                    }
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public final boolean A0L() {
        HashSet hashSet = this.targetDeviceRawJids;
        return (hashSet == null || hashSet.isEmpty()) ? false : true;
    }

    @Override // X.C0I7
    public void ASu(Context context) {
        C0C5 c0c5 = (C0C5) AnonymousClass029.A0X(context.getApplicationContext());
        this.A0A = c0c5.A0d();
        this.A06 = c0c5.A0F();
        this.A07 = c0c5.A0M();
        this.A0L = c0c5.A1H();
        this.A0I = c0c5.A13();
        this.A08 = c0c5.A0N();
        this.A0C = c0c5.A0k();
        this.A0M = c0c5.A1P();
        this.A0D = c0c5.A0n();
        this.A0B = c0c5.A0j();
        this.A0G = c0c5.A0v();
        this.A0H = c0c5.A0z();
        this.A0Q = c0c5.A1c();
        this.A09 = c0c5.A0P();
        this.A0K = c0c5.A1C();
        this.A0S = c0c5.A1l();
        this.A0E = c0c5.A0p();
        this.A0O = c0c5.A1V();
        this.A0F = c0c5.A0r();
        this.A0P = c0c5.A1Z();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        try {
            this.A0N = C40531sQ.A0A((byte[]) objectInputStream.readObject());
        } catch (OptionalDataException unused) {
            StringBuilder A0P = C000200d.A0P("sende2emessagejob/e2e missing message bytes ");
            A0P.append(A0D());
            Log.e(A0P.toString());
        }
        if (this.A0N != null) {
            if (this.id != null) {
                Jid nullable = Jid.getNullable(this.jid);
                if (nullable != null) {
                    this.A0J = DeviceJid.getNullable(this.jid);
                    DeviceJid nullable2 = DeviceJid.getNullable(this.participant);
                    if (this.groupParticipantHashToSend == null) {
                        this.groupParticipantHashToSend = this.groupParticipantHash;
                    }
                    this.A0T = true;
                    this.A05 = SystemClock.uptimeMillis();
                    A0I(nullable, nullable2);
                    return;
                }
                StringBuilder A0P2 = C000200d.A0P("jid must not be null");
                A0P2.append(A0D());
                throw new InvalidObjectException(A0P2.toString());
            }
            StringBuilder A0P3 = C000200d.A0P("id must not be null");
            A0P3.append(A0D());
            throw new InvalidObjectException(A0P3.toString());
        }
        StringBuilder A0P4 = C000200d.A0P("message must not be null");
        A0P4.append(A0D());
        throw new InvalidObjectException(A0P4.toString());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.A0N.A0B());
    }

    /* loaded from: classes2.dex */
    public class EncryptionFailException extends Exception {
        public final int encryptionRetryCount;
        public final DeviceJid jid;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public EncryptionFailException(com.whatsapp.jid.DeviceJid r3, int r4) {
            /*
                r2 = this;
                java.lang.String r1 = "Unable to encrypt message for "
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.jid = r3
                r2.encryptionRetryCount = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.EncryptionFailException.<init>(com.whatsapp.jid.DeviceJid, int):void");
        }
    }

    /* loaded from: classes2.dex */
    public class UnrecoverableErrorException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnrecoverableErrorException(com.whatsapp.jid.DeviceJid r3) {
            /*
                r2 = this;
                java.lang.String r1 = "Unable to encrypt message for "
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendE2EMessageJob.UnrecoverableErrorException.<init>(com.whatsapp.jid.DeviceJid):void");
        }
    }
}
