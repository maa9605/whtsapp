package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0HM  reason: invalid class name */
/* loaded from: classes.dex */
public class C0HM {
    public final File A00;
    public final File A01;
    public final File A02;
    public final File A03;
    public final File A04;
    public final File A05;
    public final File A06;
    public final File A07;
    public final File A08;
    public final File A09;
    public final File A0A;
    public final File A0B;
    public final File A0C;
    public final File A0D;
    public final File A0E;
    public final File A0F;
    public final File A0G;
    public final File A0H;
    public final File A0I;
    public final File A0J;
    public final File A0K;
    public final File A0L;
    public final File A0M;
    public final File A0N;
    public final File A0O;
    public final File A0P;

    public C0HM(AbstractC012105x abstractC012105x) {
        AnonymousClass034 anonymousClass034 = abstractC012105x.A02;
        File A03 = anonymousClass034.A03();
        AbstractC012105x.A03(A03, false);
        this.A0A = A03;
        File A06 = anonymousClass034.A06(".Shared");
        AbstractC012105x.A03(A06, true);
        this.A03 = A06;
        C001200o c001200o = abstractC012105x.A03;
        File file = new File(c001200o.A00.getFilesDir(), ".Shared");
        AbstractC012105x.A03(file, false);
        this.A09 = file;
        File file2 = new File(this.A0A, AbstractC012105x.A08);
        AbstractC012105x.A03(file2, false);
        this.A01 = file2;
        File file3 = new File(this.A0A, AbstractC012105x.A07);
        AbstractC012105x.A03(file3, false);
        this.A00 = file3;
        File file4 = new File(this.A0A, AbstractC012105x.A0F);
        AbstractC012105x.A03(file4, true);
        this.A0O = file4;
        File file5 = this.A0A;
        String str = AbstractC012105x.A0E;
        File file6 = new File(file5, str);
        AbstractC012105x.A03(file6, false);
        this.A0N = file6;
        File file7 = this.A0A;
        String str2 = AbstractC012105x.A0B;
        File file8 = new File(file7, str2);
        AbstractC012105x.A03(file8, false);
        this.A05 = file8;
        File file9 = new File(this.A0A, AbstractC012105x.A0A);
        AbstractC012105x.A03(file9, false);
        this.A02 = file9;
        File file10 = new File(this.A0A, "WallPaper");
        AbstractC012105x.A03(file10, false);
        this.A0P = file10;
        File file11 = new File(this.A0A, AbstractC012105x.A0C);
        AbstractC012105x.A03(file11, false);
        this.A0G = file11;
        File file12 = new File(this.A0A, ".Statuses");
        AbstractC012105x.A03(file12, true);
        this.A0M = file12;
        File file13 = new File(c001200o.A00.getFilesDir(), "ViewOnce");
        AbstractC012105x.A03(file13, true);
        this.A08 = file13;
        File file14 = new File(c001200o.A00.getFilesDir(), str2);
        AbstractC012105x.A03(file14, true);
        this.A06 = file14;
        File file15 = new File(c001200o.A00.getFilesDir(), str);
        AbstractC012105x.A03(file15, true);
        this.A07 = file15;
        File file16 = new File(this.A0A, AbstractC012105x.A09);
        if (file16.exists()) {
            AnonymousClass024.A0g(file16);
            Log.i("fmessageio/initExternalStorageDirectory calls dir removed");
        }
        File file17 = new File(this.A01, "Sent");
        AbstractC012105x.A03(file17, true);
        this.A0I = file17;
        File file18 = new File(this.A00, "Sent");
        AbstractC012105x.A03(file18, true);
        this.A0H = file18;
        File file19 = new File(this.A0N, "Sent");
        AbstractC012105x.A03(file19, true);
        this.A0L = file19;
        File file20 = new File(this.A05, "Sent");
        AbstractC012105x.A03(file20, true);
        this.A0K = file20;
        File file21 = new File(this.A02, "Sent");
        AbstractC012105x.A03(file21, true);
        this.A0J = file21;
        File file22 = new File(this.A01, "Private");
        AbstractC012105x.A03(file22, true);
        this.A0C = file22;
        File file23 = new File(this.A00, "Private");
        AbstractC012105x.A03(file23, true);
        this.A0B = file23;
        File file24 = new File(this.A0N, "Private");
        AbstractC012105x.A03(file24, true);
        this.A0F = file24;
        File file25 = new File(this.A05, "Private");
        AbstractC012105x.A03(file25, true);
        this.A0E = file25;
        File file26 = new File(this.A02, "Private");
        AbstractC012105x.A03(file26, true);
        this.A0D = file26;
        File file27 = new File(this.A0A, AbstractC012105x.A0D);
        AbstractC012105x.A03(file27, true);
        this.A04 = file27;
    }
}