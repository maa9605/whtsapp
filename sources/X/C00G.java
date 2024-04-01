package X;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Process;
import android.util.Pair;

/* renamed from: X.00G */
/* loaded from: classes.dex */
public class C00G {
    public static volatile C00G A02;
    public final C001200o A00;
    public final C00C A01;

    public C00G(C001200o c001200o, C00C c00c) {
        this.A00 = c001200o;
        this.A01 = c00c;
    }

    public static C00G A00() {
        if (A02 == null) {
            synchronized (C00G.class) {
                if (A02 == null) {
                    A02 = new C00G(C001200o.A01, C00C.A00());
                }
            }
        }
        return A02;
    }

    public C07F A01() {
        int length;
        C07F c07f;
        synchronized (this.A01) {
        }
        if (Binder.getCallingUid() != Process.myUid()) {
            int callingUid = Binder.getCallingUid();
            String[] packagesForUid = this.A00.A00.getPackageManager().getPackagesForUid(callingUid);
            if (packagesForUid != null && (length = packagesForUid.length) != 0) {
                if (length == 1) {
                    String str = packagesForUid[0];
                    String A04 = A04(str);
                    if (C1PS.A01.contains(Pair.create(str, A04))) {
                        c07f = new C07F(true, str, callingUid, A04);
                    } else {
                        c07f = new C07F(false, str, callingUid, A04);
                    }
                    if (c07f.A03) {
                        return c07f;
                    }
                    throw new SecurityException(c07f.toString());
                }
                throw new SecurityException(C000200d.A0D("Multiple packages per uid are not supported, uid: ", callingUid));
            }
            throw new SecurityException(C000200d.A0D("No packages associated with uid: ", callingUid));
        }
        throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread.");
    }

    public C07F A02(String str) {
        int i = this.A00.A00.getPackageManager().getPackageInfo(str, 0).applicationInfo.uid;
        String A04 = A04(str);
        if (C1PS.A01.contains(Pair.create(str, A04))) {
            return new C07F(true, str, i, A04);
        }
        return new C07F(false, str, i, A04);
    }

    public C07F A03(String str) {
        try {
            C07F A022 = A02(str);
            if (A022.A03) {
                return A022;
            }
            throw new SecurityException(A022.toString());
        } catch (PackageManager.NameNotFoundException e) {
            throw new SecurityException(C000200d.A0H("Package not found: ", str), e);
        }
    }

    public final String A04(String str) {
        int length;
        try {
            PackageInfo packageInfo = this.A00.A00.getPackageManager().getPackageInfo(str, 64);
            String str2 = packageInfo.packageName;
            if (str.equals(str2)) {
                Signature[] signatureArr = packageInfo.signatures;
                if (signatureArr != null && (length = signatureArr.length) != 0) {
                    if (length <= 1) {
                        Signature signature = signatureArr[0];
                        if (signature != null) {
                            return AnonymousClass029.A0Z(signature);
                        }
                        throw new SecurityException("No uid signature.");
                    }
                    throw new SecurityException(C000200d.A0H("Multiple signatures not supported: ", str));
                }
                throw new SecurityException(C000200d.A0H("Signatures are missing: ", str));
            }
            StringBuilder A0W = C000200d.A0W("Package name mismatch: expected=", str, ", was=");
            A0W.append(str2);
            throw new SecurityException(A0W.toString());
        } catch (PackageManager.NameNotFoundException unused) {
            throw new SecurityException(C000200d.A0H("Name not found: ", str));
        }
    }
}
