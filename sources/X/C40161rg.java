package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1rg */
/* loaded from: classes2.dex */
public class C40161rg {
    public static final Set A00 = new HashSet();

    public static Object A00(AbstractC40111rb abstractC40111rb, AbstractC40151rf abstractC40151rf, String str) {
        return A01(abstractC40111rb, abstractC40151rf, str, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:887:0x079a, code lost:
        r7 = X.AnonymousClass024.A0D(r16.getErrorStream());
        r10.A06.A09("gdrive-api-v2/rename-backup", r7, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x07ae, code lost:
        throw new X.C639431l(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:904:0x07f5, code lost:
        com.whatsapp.util.Log.e("gdrive-api-v2/backup/rename failed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x0801, code lost:
        throw new X.C640131s("unable to get new name");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:901:0x07dc A[Catch: 31s -> 0x08ed, all -> 0x0974, TryCatch #36 {31s -> 0x08ed, blocks: (B:546:0x0040, B:548:0x0048, B:550:0x004c, B:552:0x0050, B:554:0x0054, B:556:0x0058, B:558:0x005c, B:560:0x0060, B:562:0x0064, B:564:0x0068, B:566:0x006c, B:568:0x0070, B:570:0x0074, B:572:0x007c, B:574:0x0096, B:575:0x009b, B:950:0x08c6, B:952:0x08cc, B:576:0x00a1, B:589:0x00ed, B:590:0x00f0, B:593:0x00f7, B:594:0x00fa, B:595:0x00fd, B:596:0x00fe, B:597:0x00ff, B:599:0x011b, B:601:0x0122, B:603:0x012d, B:604:0x0131, B:606:0x013e, B:608:0x014a, B:610:0x0152, B:652:0x02c9, B:649:0x02ad, B:673:0x02f4, B:674:0x02f7, B:675:0x02fa, B:676:0x02fb, B:677:0x0319, B:680:0x031e, B:681:0x0322, B:682:0x0323, B:686:0x033a, B:685:0x0336, B:687:0x0340, B:689:0x0352, B:690:0x0359, B:713:0x03fa, B:723:0x0416, B:724:0x0419, B:725:0x041c, B:726:0x041d, B:728:0x0431, B:730:0x0437, B:759:0x04f8, B:754:0x04eb, B:781:0x0530, B:782:0x0533, B:783:0x0536, B:786:0x053a, B:787:0x053e, B:789:0x0550, B:791:0x0556, B:811:0x0632, B:820:0x065f, B:849:0x0697, B:850:0x069a, B:851:0x069d, B:852:0x069e, B:853:0x06a5, B:856:0x06a9, B:857:0x06ad, B:858:0x06ba, B:860:0x06c4, B:862:0x06d5, B:901:0x07dc, B:902:0x07e0, B:863:0x06dc, B:886:0x0793, B:898:0x07d1, B:926:0x0836, B:927:0x0839, B:928:0x083c, B:929:0x083d, B:930:0x083e, B:932:0x0853, B:934:0x0881, B:935:0x0885, B:937:0x088a, B:938:0x088d, B:939:0x088e, B:940:0x088f, B:942:0x08a2, B:944:0x08a7, B:946:0x08be), top: B:999:0x0040, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:902:0x07e0 A[Catch: 31s -> 0x08ed, all -> 0x0974, TRY_LEAVE, TryCatch #36 {31s -> 0x08ed, blocks: (B:546:0x0040, B:548:0x0048, B:550:0x004c, B:552:0x0050, B:554:0x0054, B:556:0x0058, B:558:0x005c, B:560:0x0060, B:562:0x0064, B:564:0x0068, B:566:0x006c, B:568:0x0070, B:570:0x0074, B:572:0x007c, B:574:0x0096, B:575:0x009b, B:950:0x08c6, B:952:0x08cc, B:576:0x00a1, B:589:0x00ed, B:590:0x00f0, B:593:0x00f7, B:594:0x00fa, B:595:0x00fd, B:596:0x00fe, B:597:0x00ff, B:599:0x011b, B:601:0x0122, B:603:0x012d, B:604:0x0131, B:606:0x013e, B:608:0x014a, B:610:0x0152, B:652:0x02c9, B:649:0x02ad, B:673:0x02f4, B:674:0x02f7, B:675:0x02fa, B:676:0x02fb, B:677:0x0319, B:680:0x031e, B:681:0x0322, B:682:0x0323, B:686:0x033a, B:685:0x0336, B:687:0x0340, B:689:0x0352, B:690:0x0359, B:713:0x03fa, B:723:0x0416, B:724:0x0419, B:725:0x041c, B:726:0x041d, B:728:0x0431, B:730:0x0437, B:759:0x04f8, B:754:0x04eb, B:781:0x0530, B:782:0x0533, B:783:0x0536, B:786:0x053a, B:787:0x053e, B:789:0x0550, B:791:0x0556, B:811:0x0632, B:820:0x065f, B:849:0x0697, B:850:0x069a, B:851:0x069d, B:852:0x069e, B:853:0x06a5, B:856:0x06a9, B:857:0x06ad, B:858:0x06ba, B:860:0x06c4, B:862:0x06d5, B:901:0x07dc, B:902:0x07e0, B:863:0x06dc, B:886:0x0793, B:898:0x07d1, B:926:0x0836, B:927:0x0839, B:928:0x083c, B:929:0x083d, B:930:0x083e, B:932:0x0853, B:934:0x0881, B:935:0x0885, B:937:0x088a, B:938:0x088d, B:939:0x088e, B:940:0x088f, B:942:0x08a2, B:944:0x08a7, B:946:0x08be), top: B:999:0x0040, outer: #32 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A01(X.AbstractC40111rb r32, X.AbstractC40151rf r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 2429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40161rg.A01(X.1rb, X.1rf, java.lang.String, int):java.lang.Object");
    }

    public static void A02() {
        Set<Thread> set = A00;
        synchronized (set) {
            for (Thread thread : set) {
                thread.interrupt();
            }
        }
        StringBuilder A0P = C000200d.A0P("gdrive-retry-task/interrupt-active-tasks/size/");
        A0P.append(set.size());
        Log.i(A0P.toString());
    }

    public static void A03(Thread thread) {
        Set set = A00;
        synchronized (set) {
            set.remove(thread);
        }
        set.size();
    }
}
