export interface PictureInPicturePlugin {
  isPiPAvailable(): Promise<{ available: boolean }>;
  isPipEnable(): Promise<{ enable: boolean }>;
  startPiPMode(options?: { aspectRatio?: IRatio }): Promise<{ success: boolean }>;
  openSettings(): Promise<void>;
}

export interface IRatio {
  height: number;
  width: number;
}