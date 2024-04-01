package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1vz */
/* loaded from: classes2.dex */
public class C42591vz {
    public static volatile C42591vz A0g;
    public final AbstractC000600i A00;
    public static final byte[] A0b = {102, 116, 121, 112};
    public static final byte[] A0T = {35, 33, 65, 77, 82, 10};
    public static final byte[] A0U = {35, 33, 65, 77, 82, 45, 87, 66, 10};
    public static final byte[] A0V = {79, 103, 103, 83};
    public static final byte[] A0W = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] A0a = {73, 68, 51};
    public static final byte[] A0X = {82, 73, 70, 70};
    public static final C43511xW A0Q = new C43511xW(0, 7, true);
    public static final C43511xW A0P = new C43511xW(0, 0, true);
    public static final byte[] A0e = {87, 65, 86, 69};
    public static final byte[] A0Z = {102, 109, 116, 32};
    public static final byte[] A0Y = {100, 97, 116, 97};
    public static final int[] A0f = {A01((byte) 97, (byte) 100, (byte) 116, (byte) 108), A01((byte) 99, (byte) 117, (byte) 101, (byte) 32), A01((byte) 100, (byte) 97, (byte) 116, (byte) 97), A01((byte) 102, (byte) 97, (byte) 99, (byte) 116), A01((byte) 102, (byte) 109, (byte) 116, (byte) 32), A01((byte) 105, (byte) 110, (byte) 115, (byte) 116), A01((byte) 108, (byte) 97, (byte) 98, (byte) 108), A01((byte) 108, (byte) 116, (byte) 120, (byte) 116), A01((byte) 110, (byte) 111, (byte) 116, (byte) 101), A01((byte) 112, (byte) 108, (byte) 115, (byte) 116), A01((byte) 115, (byte) 109, (byte) 112, (byte) 108)};
    public static final C43261x7 A0S = new C43261x7(0, 5, 7, true);
    public static final C43261x7 A0R = new C43261x7(0, 0, 0, true);
    public static final byte[] A0d = {113, 116, 32, 32};
    public static final byte[] A0c = {51, 103};
    public static final int A0D = A01((byte) 109, (byte) 111, (byte) 111, (byte) 118);
    public static final int A0N = A01((byte) 116, (byte) 114, (byte) 97, (byte) 107);
    public static final int A0M = A01((byte) 116, (byte) 107, (byte) 104, (byte) 100);
    public static final int A0B = A01((byte) 109, (byte) 100, (byte) 105, (byte) 97);
    public static final int A07 = A01((byte) 104, (byte) 100, (byte) 108, (byte) 114);
    public static final int A0C = A01((byte) 109, (byte) 105, (byte) 110, (byte) 102);
    public static final int A0K = A01((byte) 115, (byte) 116, (byte) 98, (byte) 108);
    public static final int A0L = A01((byte) 115, (byte) 116, (byte) 115, (byte) 100);
    public static final int A04 = A01((byte) 97, (byte) 118, (byte) 99, (byte) 49);
    public static final int A0F = A01((byte) 109, (byte) 112, (byte) 52, (byte) 118);
    public static final int A0H = A01((byte) 115, (byte) 50, (byte) 54, (byte) 51);
    public static final int A0A = A01((byte) 104, (byte) 118, (byte) 99, (byte) 49);
    public static final int A0E = A01((byte) 109, (byte) 112, (byte) 52, (byte) 97);
    public static final int A0I = A01((byte) 115, (byte) 97, (byte) 109, (byte) 114);
    public static final int A0J = A01((byte) 115, (byte) 97, (byte) 119, (byte) 98);
    public static final int A06 = A01((byte) 101, (byte) 115, (byte) 100, (byte) 115);
    public static final int A0G = A01((byte) 46, (byte) 109, (byte) 112, (byte) 51);
    public static final int A05 = A01((byte) 101, (byte) 99, (byte) 45, (byte) 51);
    public static final int A0O = A01((byte) 119, (byte) 97, (byte) 118, (byte) 101);
    public static final int A08 = A01((byte) 115, (byte) 111, (byte) 117, (byte) 110);
    public static final int A09 = A01((byte) 118, (byte) 105, (byte) 100, (byte) 101);
    public static int A03 = 0;
    public static int A01 = 1;
    public static int A02 = 2;

    public static int A01(byte b, byte b2, byte b3, byte b4) {
        return ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static byte[] A0G(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public C42591vz(AbstractC000600i abstractC000600i) {
        this.A00 = abstractC000600i;
    }

    public static float A00(long j) {
        long j2 = j >> ((int) 16);
        float pow = (float) Math.pow(2.0d, 16L);
        return (((float) (j & (pow - 1))) / pow) + ((float) j2);
    }

    public static int A02(InputStream inputStream, C43671xm c43671xm) {
        try {
            int i = (int) (c43671xm.A01 - c43671xm.A02);
            byte[] bArr = new byte[i];
            if (A04(inputStream, bArr, 0, i) != i) {
                return 7;
            }
            byte b = bArr[4];
            if (b != 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Did not find esds description tag - found: ");
                sb.append((int) b);
                Log.i(sb.toString());
                return 7;
            }
            int[] A0I2 = A0I(bArr, 4, i);
            if (A0I2 == null) {
                Log.i("Did not find esds description details");
                return 7;
            }
            int i2 = A0I2[0] + 3;
            byte b2 = bArr[i2];
            int i3 = 1;
            int i4 = i2 + 1;
            if ((b2 & 128) == 128) {
                i4 += 2;
            }
            if ((b2 & 64) == 64) {
                i4 += bArr[i4] + 1;
            }
            if ((b2 & 32) == 32) {
                i4 += 2;
            }
            byte b3 = bArr[i4];
            if (b3 != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Did not find esds config description tag - found: ");
                sb2.append((int) b3);
                Log.i(sb2.toString());
                return 7;
            }
            int[] A0I3 = A0I(bArr, i4, i);
            if (A0I3 == null) {
                Log.i("Did not find esds config details");
                return 7;
            }
            int i5 = A0I3[0];
            byte b4 = bArr[i5 + 1];
            if (b4 != 64) {
                if (b4 != 107) {
                    switch (b4) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Did not find esds supported type - found: ");
                            sb3.append((int) b4);
                            Log.i(sb3.toString());
                            return 7;
                        case 105:
                            i3 = 2;
                            break;
                    }
                }
                i3 = 2;
            }
            byte b5 = bArr[i5 + 2];
            if (((b5 & 252) >> 2) != 5) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Did not find stream type - found: ");
                sb4.append((int) b5);
                Log.i(sb4.toString());
                return 7;
            }
            return i3;
        } catch (Exception e) {
            Log.i("Exception processing esds box: ", e);
            return 7;
        }
    }

    public static int A03(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 36;
        byte[] bArr2 = new byte[36];
        byte[] bArr3 = new byte[8];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        if (A04(inputStream, bArr2, i, 36 - i) + i != 36) {
            Log.i("Insufficient data for WAV file header");
            return 0;
        }
        byte[] bArr4 = A0e;
        if (!A0F(bArr2, 8, bArr4)) {
            C000200d.A1N(C000200d.A0P("Not WAVE File type "), new String(bArr2, 8, bArr4.length));
            return 7;
        }
        byte[] bArr5 = A0Z;
        if (!A0F(bArr2, 12, bArr5)) {
            C000200d.A1N(C000200d.A0P("Not WAVE chunk format "), new String(bArr2, 12, bArr5.length));
            return 7;
        }
        int A012 = A01((byte) 0, (byte) 0, bArr2[21], bArr2[20]);
        if (80 != A012 && 85 != A012 && 5632 != A012 && 5648 != A012) {
            C000200d.A0q("RIFF/WAV container carries stream which is not one of supported MPEG audio streams ", A012);
            return 7;
        }
        int A013 = A01(bArr2[19], bArr2[18], bArr2[17], bArr2[16]) + 16 + 4;
        while (true) {
            try {
                A0E(inputStream, A013 - i2);
                int A042 = A04(inputStream, bArr3, 0, 8);
                int i3 = A013 + A042;
                if (A042 != 8) {
                    Log.i("EOF reading WAVE chunk");
                    return 7;
                }
                if (!AnonymousClass029.A1a(A0f, A01(bArr3[0], bArr3[1], bArr3[2], bArr3[3]))) {
                    StringBuilder A0P2 = C000200d.A0P("Unsupported WAVE chunk: ");
                    A0P2.append(new String(bArr3, 0, 4));
                    Log.i(A0P2.toString());
                    return 7;
                } else if (A0F(bArr3, 0, A0Y)) {
                    byte[] bArr6 = new byte[2];
                    if (A04(inputStream, bArr6, 0, 2) != 2) {
                        Log.i("EOF reading WAVE data");
                        return 7;
                    }
                    if (bArr6[0] == -1) {
                        byte b = bArr6[1];
                        if (((byte) (b & 224)) == -32) {
                            return (b & 6) == 0 ? 1 : 2;
                        }
                    }
                    Log.i("Not ACC/MP3 WAVE data");
                    return 7;
                } else {
                    i2 = i3;
                    A013 = A01(bArr3[7], bArr3[6], bArr3[5], bArr3[4]) + i3;
                }
            } catch (IOException e) {
                Log.i("Excepton reading next chunk ", e);
                return 7;
            }
        }
    }

    public static int A04(InputStream inputStream, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length - i);
        int i3 = 0;
        while (i3 < min) {
            int read = inputStream.read(bArr, i + i3, min - i3);
            if (read == -1) {
                return i3;
            }
            i3 += read;
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0217, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x006b, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0339 A[Catch: all -> 0x037f, TryCatch #2 {all -> 0x037f, blocks: (B:184:0x0009, B:186:0x0016, B:187:0x001a, B:189:0x0027, B:191:0x0030, B:192:0x0034, B:194:0x0056, B:249:0x0218, B:195:0x005d, B:196:0x006b, B:198:0x0071, B:200:0x0085, B:201:0x008d, B:203:0x0093, B:205:0x00a5, B:206:0x00ac, B:208:0x00c7, B:209:0x00ce, B:211:0x00e6, B:212:0x00ed, B:214:0x00ff, B:215:0x0106, B:217:0x010a, B:218:0x011c, B:241:0x0209, B:221:0x0129, B:223:0x0140, B:224:0x0147, B:226:0x0163, B:227:0x016a, B:229:0x0184, B:230:0x018b, B:232:0x01b3, B:233:0x01b9, B:235:0x01bd, B:236:0x01d0, B:238:0x01fa, B:239:0x0200, B:250:0x0221, B:252:0x022a, B:254:0x0235, B:255:0x0243, B:257:0x0250, B:259:0x025e, B:262:0x0270, B:264:0x0276, B:265:0x027d, B:266:0x028a, B:268:0x0293, B:271:0x029b, B:272:0x02a2, B:274:0x02ad, B:277:0x02b6, B:279:0x02bf, B:282:0x02eb, B:284:0x02f1, B:286:0x02f5, B:288:0x02fc, B:290:0x0303, B:292:0x0309, B:293:0x030e, B:294:0x0313, B:296:0x0316, B:298:0x031c, B:301:0x0325, B:304:0x0330, B:306:0x0339, B:307:0x033c, B:309:0x0341, B:311:0x0348, B:313:0x034c, B:314:0x0352, B:315:0x035a, B:317:0x0363, B:318:0x036a, B:320:0x0372, B:321:0x0379, B:303:0x032d), top: B:334:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x033c A[Catch: all -> 0x037f, TryCatch #2 {all -> 0x037f, blocks: (B:184:0x0009, B:186:0x0016, B:187:0x001a, B:189:0x0027, B:191:0x0030, B:192:0x0034, B:194:0x0056, B:249:0x0218, B:195:0x005d, B:196:0x006b, B:198:0x0071, B:200:0x0085, B:201:0x008d, B:203:0x0093, B:205:0x00a5, B:206:0x00ac, B:208:0x00c7, B:209:0x00ce, B:211:0x00e6, B:212:0x00ed, B:214:0x00ff, B:215:0x0106, B:217:0x010a, B:218:0x011c, B:241:0x0209, B:221:0x0129, B:223:0x0140, B:224:0x0147, B:226:0x0163, B:227:0x016a, B:229:0x0184, B:230:0x018b, B:232:0x01b3, B:233:0x01b9, B:235:0x01bd, B:236:0x01d0, B:238:0x01fa, B:239:0x0200, B:250:0x0221, B:252:0x022a, B:254:0x0235, B:255:0x0243, B:257:0x0250, B:259:0x025e, B:262:0x0270, B:264:0x0276, B:265:0x027d, B:266:0x028a, B:268:0x0293, B:271:0x029b, B:272:0x02a2, B:274:0x02ad, B:277:0x02b6, B:279:0x02bf, B:282:0x02eb, B:284:0x02f1, B:286:0x02f5, B:288:0x02fc, B:290:0x0303, B:292:0x0309, B:293:0x030e, B:294:0x0313, B:296:0x0316, B:298:0x031c, B:301:0x0325, B:304:0x0330, B:306:0x0339, B:307:0x033c, B:309:0x0341, B:311:0x0348, B:313:0x034c, B:314:0x0352, B:315:0x035a, B:317:0x0363, B:318:0x036a, B:320:0x0372, B:321:0x0379, B:303:0x032d), top: B:334:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C43511xW A05(java.io.File r23) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42591vz.A05(java.io.File):X.1xW");
    }

    public static C43261x7 A06(File file) {
        return A07(file, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:439:0x0450, code lost:
        com.whatsapp.util.Log.i("esds box not found");
        r4 = X.C42591vz.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0481, code lost:
        com.whatsapp.util.Log.i("multiple hldr audio tracks found - not dolby");
        r4 = X.C42591vz.A0S;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0259, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0098 A[Catch: all -> 0x0492, TryCatch #0 {all -> 0x0492, blocks: (B:252:0x000b, B:254:0x0018, B:255:0x001b, B:257:0x0024, B:263:0x003f, B:265:0x0060, B:343:0x023f, B:344:0x0259, B:346:0x025f, B:348:0x0271, B:349:0x0279, B:351:0x027f, B:353:0x0297, B:354:0x02a0, B:356:0x02a4, B:358:0x02b2, B:360:0x02bd, B:367:0x02d2, B:370:0x02fc, B:372:0x0300, B:374:0x0304, B:375:0x030c, B:376:0x0311, B:378:0x032e, B:380:0x0332, B:382:0x0336, B:384:0x033b, B:386:0x0340, B:388:0x0345, B:390:0x034a, B:392:0x034f, B:394:0x0354, B:407:0x039e, B:409:0x03a1, B:411:0x03b7, B:413:0x03c2, B:415:0x03df, B:416:0x03e8, B:418:0x0400, B:419:0x0409, B:421:0x041c, B:423:0x0420, B:342:0x0234, B:425:0x042d, B:442:0x0466, B:271:0x0078, B:273:0x0090, B:274:0x0098, B:276:0x00b3, B:277:0x00bb, B:279:0x00d4, B:280:0x00dc, B:282:0x00ed, B:284:0x010d, B:285:0x0116, B:287:0x011a, B:289:0x0121, B:291:0x0127, B:293:0x012d, B:294:0x0132, B:296:0x0157, B:298:0x0162, B:300:0x0168, B:445:0x0481, B:308:0x018a, B:302:0x016c, B:304:0x0170, B:313:0x0194, B:315:0x01b0, B:317:0x01c9, B:439:0x0450, B:323:0x01fc, B:440:0x0459, B:341:0x0230, B:441:0x0462, B:320:0x01e4, B:331:0x0210, B:333:0x0216, B:337:0x0220, B:338:0x0225, B:340:0x022b, B:432:0x043c, B:434:0x0440, B:436:0x0444, B:443:0x046a, B:397:0x035b, B:399:0x0360, B:401:0x037a, B:403:0x0388, B:406:0x0396, B:404:0x038e, B:446:0x048a, B:447:0x0491, B:444:0x046e, B:260:0x0033, B:266:0x0068), top: B:454:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:474:0x03b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.C43261x7 A07(java.io.File r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42591vz.A07(java.io.File, boolean):X.1x7");
    }

    public static C43671xm A08(InputStream inputStream, long j, long j2, int[] iArr) {
        byte[] bArr;
        long j3 = j2;
        new String(A0G(iArr[0]));
        long j4 = 0;
        if (j > 0) {
            if (j2 > 0 && j > j2) {
                throw new IOException("Not enough bytes to skip");
            }
            A0E(inputStream, j);
            j3 = j2 == -1 ? -1L : j2 - j;
        }
        int i = 8;
        byte[] bArr2 = new byte[8];
        while (true) {
            if (j3 != -1 && j3 <= j4) {
                return null;
            }
            int A042 = A04(inputStream, bArr2, 0, i);
            if (A042 >= i) {
                long j5 = j3 == -1 ? -1L : j3 - A042;
                for (int i2 = 4; i2 < i; i2++) {
                    byte b = bArr2[i2];
                    if (b < 32) {
                        C000200d.A1F(C000200d.A0P("Found non character data in box type "), b);
                        return null;
                    }
                }
                int A012 = A01(bArr2[0], bArr2[1], bArr2[2], bArr2[3]);
                new String(bArr2, 4, 4);
                if (A012 == 0) {
                    A012 = -1;
                } else if (A012 == 1) {
                    A042 += A04(inputStream, new byte[i], 0, i);
                    if (A042 == 16) {
                        j5 = j5 == -1 ? -1L : j5 - A042;
                        long A013 = (A01(bArr[0], bArr[1], bArr[2], bArr[3]) << 32) | A01(bArr[4], bArr[5], bArr[6], bArr[7]);
                        if (A013 > 2147483647L) {
                            StringBuilder sb = new StringBuilder("Length of box too long to be processed: ");
                            sb.append(A013);
                            throw new IOException(sb.toString());
                        }
                        A012 = (int) A013;
                    } else {
                        throw new IOException("End of file looking for wide box length");
                    }
                }
                if (j5 > 0 && j5 < A012 - A042) {
                    StringBuilder sb2 = new StringBuilder("Length of box too long to be in current input: ");
                    sb2.append(A012);
                    sb2.append('>');
                    sb2.append(j5);
                    throw new IOException(sb2.toString());
                }
                int A014 = A01(bArr2[4], bArr2[5], bArr2[6], bArr2[7]);
                if (AnonymousClass029.A1a(iArr, A014)) {
                    new String(A0G(A014));
                    return new C43671xm(A012, A014, A042);
                }
                new String(A0G(A014));
                long j6 = A012 - A042;
                A0E(inputStream, j6);
                j3 = j5 == -1 ? -1L : j5 - j6;
                i = 8;
                j4 = 0;
            } else {
                throw new IOException("End of file looking for box header");
            }
        }
    }

    public static C42591vz A09() {
        if (A0g == null) {
            synchronized (C42591vz.class) {
                if (A0g == null) {
                    A0g = new C42591vz(AbstractC000600i.A00());
                }
            }
        }
        return A0g;
    }

    public static String A0A(AbstractC000600i abstractC000600i, File file) {
        int i = A07(file, false).A01;
        return i == 7 ? "video/quicktime" : i == 3 ? "video/3gpp" : "video/mp4";
    }

    public static String A0B(C43511xW c43511xW) {
        switch (c43511xW.A00) {
            case 0:
            case 4:
            case 7:
            case 8:
                Log.w("unsupported audio type; returning null mime type");
                StringBuilder A0P2 = C000200d.A0P("Audio type not supported: ");
                A0P2.append(c43511xW.A00);
                throw new Exception(A0P2.toString()) { // from class: X.1xo
                    public static final long serialVersionUID = 1;
                };
            case 1:
                return c43511xW.A01 != 2 ? "audio/aac" : "audio/mp4";
            case 2:
                return c43511xW.A01 != 2 ? "audio/mpeg" : "audio/mp4";
            case 3:
                return "audio/amr";
            case 5:
                return "audio/ogg; codecs=opus";
            case 6:
            default:
                StringBuilder sb = new StringBuilder("invalid audio type returned; ");
                sb.append(c43511xW);
                throw new AssertionError(sb.toString());
        }
    }

    public static String A0C(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            if (z) {
                Log.w("empty audio mime type");
            }
            return null;
        } else if ("audio/aac".equals(str)) {
            return "aac";
        } else {
            if ("audio/mp4".equals(str)) {
                return "m4a";
            }
            if ("audio/amr".equals(str)) {
                return "amr";
            }
            if ("audio/mpeg".equals(str)) {
                return "mp3";
            }
            if ("audio/ogg; codecs=opus".equals(str)) {
                return "opus";
            }
            if (z) {
                C000200d.A15("unrecognized audio mime type; mimeType=", str);
            }
            return null;
        }
    }

    public static String A0D(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            if (z) {
                Log.w("empty video mime type");
            }
            return null;
        } else if ("video/mp4".equals(str)) {
            return "mp4";
        } else {
            if ("video/3gpp".equals(str)) {
                return "3gp";
            }
            if (z) {
                C000200d.A15("unrecognized video mime type; mimeType=", str);
            }
            return null;
        }
    }

    public static void A0E(InputStream inputStream, long j) {
        byte[] bArr = new byte[1024];
        while (j > 0) {
            long j2 = 1024;
            if (A04(inputStream, bArr, 0, (int) Math.min(j2, j)) == -1) {
                StringBuilder sb = new StringBuilder("Unexpected EOF skipping ");
                sb.append(j);
                throw new IOException(sb.toString());
            }
            j -= j2;
        }
    }

    public static boolean A0F(byte[] bArr, int i, byte[] bArr2) {
        int length = bArr.length - i;
        int length2 = bArr2.length;
        if (length >= length2) {
            for (int i2 = 0; i2 < length2; i2++) {
                if (bArr[i + i2] != bArr2[i2]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static int[] A0H(InputStream inputStream) {
        byte[] bArr = new byte[2];
        if (A04(inputStream, bArr, 0, 2) == 2) {
            int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            C000200d.A0q("mp4a box version: ", i);
            if (i == 0) {
                return new int[]{0, 18};
            }
            if (i == 1) {
                return new int[]{1, 34};
            }
            if (i == 2) {
                return new int[]{2, 54};
            }
            throw new IOException("Unexpected result getting mp4a version");
        }
        throw new IOException("Unexpected eof getting mp4a version");
    }

    public static int[] A0I(byte[] bArr, int i, int i2) {
        try {
            int min = Math.min(i2, i + 4);
            int i3 = i;
            int i4 = 0;
            do {
                i3++;
                i4 = (i4 << 7) + (bArr[i3] & Byte.MAX_VALUE);
                if (i >= min) {
                    break;
                }
            } while ((bArr[i3] & 128) == 128);
            if (i4 == 0) {
                return null;
            }
            return new int[]{i3, i4};
        } catch (Exception e) {
            Log.i("Exception processing esds box: ", e);
            return null;
        }
    }

    public boolean A0J(File file) {
        C43511xW A052 = A05(file);
        switch (A052.A00) {
            case 0:
            case 4:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 6:
            default:
                StringBuilder sb = new StringBuilder("invalid audio file type returned; ");
                sb.append(A052);
                throw new AssertionError(sb.toString());
        }
    }

    public boolean A0K(File file) {
        C43261x7 A072 = A07(file, false);
        int i = A072.A01;
        if (i == 2 || i == 3) {
            int i2 = A072.A00;
            if (i2 == 4 || i2 == 2 || i2 == 1 || i2 == 0 || i2 == 8) {
                int i3 = A072.A02;
                return i3 == 2 || i3 == 1 || i3 == 3;
            }
            return false;
        }
        return false;
    }
}
