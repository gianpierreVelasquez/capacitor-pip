import { registerPlugin } from '@capacitor/core';

import type { PictureInPicturePlugin } from './definitions';

const PictureInPicture = registerPlugin<PictureInPicturePlugin>('PictureInPicture');

export * from './definitions';
export { PictureInPicture };
