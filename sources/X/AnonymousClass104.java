package X;

import android.util.Log;

/* renamed from: X.104  reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass104 {
    public static final int A08 = C08M.A01("nam");
    public static final int A09 = C08M.A01("trk");
    public static final int A02 = C08M.A01("cmt");
    public static final int A0A = C08M.A01("day");
    public static final int A01 = C08M.A01("ART");
    public static final int A05 = C08M.A01("too");
    public static final int A00 = C08M.A01("alb");
    public static final int A03 = C08M.A01("com");
    public static final int A04 = C08M.A01("wrt");
    public static final int A07 = C08M.A01("lyr");
    public static final int A06 = C08M.A01("gen");
    public static final int A0D = C08M.A01("covr");
    public static final int A0G = C08M.A01("gnre");
    public static final int A0H = C08M.A01("grp");
    public static final int A0E = C08M.A01("disk");
    public static final int A0Q = C08M.A01("trkn");
    public static final int A0P = C08M.A01("tmpo");
    public static final int A0C = C08M.A01("cpil");
    public static final int A0B = C08M.A01("aART");
    public static final int A0O = C08M.A01("sonm");
    public static final int A0K = C08M.A01("soal");
    public static final int A0M = C08M.A01("soar");
    public static final int A0L = C08M.A01("soaa");
    public static final int A0N = C08M.A01("soco");
    public static final int A0J = C08M.A01("rtng");
    public static final int A0F = C08M.A01("pgap");
    public static final int A0S = C08M.A01("sosn");
    public static final int A0R = C08M.A01("tvsh");
    public static final int A0I = C08M.A01("----");
    public static final String[] A0T = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static C1ZZ A00(int i, String str, C223812f c223812f, boolean z, boolean z2) {
        int i2;
        c223812f.A0C(4);
        if (c223812f.A00() == AnonymousClass100.A0H) {
            c223812f.A0C(8);
            i2 = c223812f.A01();
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            String num = Integer.toString(i2);
            if (z) {
                return new C39241po(str, num);
            }
            return new C39221pm(str, num);
        }
        StringBuilder A0P2 = C000200d.A0P("Failed to parse uint8 attribute: ");
        A0P2.append(AnonymousClass100.A00(i));
        Log.w("MetadataUtil", A0P2.toString());
        return null;
    }

    public static C39241po A01(int i, String str, C223812f c223812f) {
        int A002 = c223812f.A00();
        if (c223812f.A00() == AnonymousClass100.A0H && A002 >= 22) {
            c223812f.A0C(10);
            int A032 = c223812f.A03();
            if (A032 > 0) {
                String A0D2 = C000200d.A0D("", A032);
                int A033 = c223812f.A03();
                if (A033 > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0D2);
                    sb.append("/");
                    sb.append(A033);
                    A0D2 = sb.toString();
                }
                return new C39241po(str, A0D2);
            }
        }
        StringBuilder A0P2 = C000200d.A0P("Failed to parse index/count attribute: ");
        A0P2.append(AnonymousClass100.A00(i));
        Log.w("MetadataUtil", A0P2.toString());
        return null;
    }

    public static C39241po A02(int i, String str, C223812f c223812f) {
        int A002 = c223812f.A00();
        if (c223812f.A00() == AnonymousClass100.A0H) {
            c223812f.A0C(8);
            return new C39241po(str, c223812f.A08(A002 - 16));
        }
        StringBuilder A0P2 = C000200d.A0P("Failed to parse text attribute: ");
        A0P2.append(AnonymousClass100.A00(i));
        Log.w("MetadataUtil", A0P2.toString());
        return null;
    }
}
