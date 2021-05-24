import defaultSettings from "@/settings";

const title = defaultSettings.title || "Super Supply Chain";

export default function getPageTitle(pageTitle) {
  if (pageTitle) {
    return `${pageTitle} - ${title}`;
  }
  return `${title}`;
}
