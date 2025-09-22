import { registerPlugin } from '@capacitor/core';

import type { PictureInPicturePlugin } from './definitions';

const PictureInPicture = registerPlugin<PictureInPicturePlugin>('PictureInPicture', {
  web: () => import('./web').then((m) => new m.PictureInPictureWeb()),
});

export * from './definitions';
export { PictureInPicture };
