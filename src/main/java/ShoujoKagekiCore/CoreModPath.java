package ShoujoKagekiCore;

public class CoreModPath {

    public static final String ModName = "ShoujoKagekiCore";
    public static final String AUTHOR = "不方不方";
    public static final String DESCRIPTION = "【少女歌剧】核心包ShoujoKageki Core Package";


    public static String makeID(String idText) {
        return ModName + ":" + idText;
    }
    public static String getFullModName() {
        return AUTHOR + ":" + getModId();
    }

    public static String getResPath(String relativePath) {
        return ModName + "Resources" + relativePath;
    }
    public static String makeCardPath(String resourcePath) {
        return getResPath("/images/cards/" + resourcePath);
    }

    public static String makeRelicPath(String resourcePath) {
        return getResPath("/images/relics/" + resourcePath);
    }

    public static String makeRelicOutlinePath(String resourcePath) {
        return getResPath("/images/relics/outline/" + resourcePath);
    }

    public static String makeOrbPath(String resourcePath) {
        return getResPath("/images/orbs/" + resourcePath);
    }

    public static String makePowerPath(String resourcePath) {
        return getResPath("/images/powers/" + resourcePath);
    }
    public static String makeUIPath(String resourcePath) {
        return getResPath("/images/ui/" + resourcePath);
    }

    public static String makeEventPath(String resourcePath) {
        return getResPath("/images/events/" + resourcePath);
    }
    public static String makeAudioPath(String resourcePath) {
        return getResPath("/audio/" + resourcePath);
    }

    public static String getModId() {
        return CoreModManager.getModID();
    }
}
